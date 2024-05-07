package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.controller.DTO.UserDTO;
import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.repository.UserRepository;
import com.DariusC9.FlatBillManagerBackend.service.errors.EmailNotUniqueException;
import com.DariusC9.FlatBillManagerBackend.service.errors.UserNotExistException;
import com.DariusC9.FlatBillManagerBackend.service.errors.UsernameNotUniqueException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    UserRepository userRepository;
    UserValidator userValidator;
    BCryptPasswordEncoder passwordEncoder;
    UserMapper userMapper;

    public UserService(UserRepository userRepository, UserValidator userValidator, BCryptPasswordEncoder passwordEncoder, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    public void saveNewUser(UserDTO newUserDTO) throws RuntimeException {
        List<User> userList = userRepository.fetchAll();
        // check if user name is unique
        boolean isUsernameUnique = userValidator.isUsernameUnique(userList, newUserDTO.name());
        if (!isUsernameUnique) {
            throw new UsernameNotUniqueException();
        }
        // check if email is unique
        boolean isEmailUnique = userValidator.isEmailUnique(userList, newUserDTO.email());
        if (!isEmailUnique) {
            throw  new EmailNotUniqueException();
        }
        User newUser = mappToUser(newUserDTO);
        // encrypt password
        String encriptedPassword = passwordEncoder.encode(newUser.getPassword());
        newUser.setPassword(encriptedPassword);
        // set id of the user
        newUser.setId(UUID.randomUUID());
        userRepository.save(newUser);
    }

    public UserDTO login(UserDTO userDTO) throws RuntimeException {
        List<User> userList = userRepository.fetchAll();
        User user = mappToUser(userDTO);
        User userValidatedByEmail = userValidator.doesUserExist(userList, user.getEmail());
        if (userValidatedByEmail == null) {
            throw new UserNotExistException();
        }
        if (passwordEncoder.matches(user.getPassword(), userValidatedByEmail.getPassword())) {
            return mappToUserDTO(userValidatedByEmail);
        } else {
            throw new UserNotExistException();
        }
    }

    private User mappToUser(UserDTO userDTO) {
        return userMapper.mappToUser(userDTO);
    }

    private UserDTO mappToUserDTO(User user) {
        return userMapper.mappToUserDTO(user);
    }
}
