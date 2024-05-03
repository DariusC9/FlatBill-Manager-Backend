package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.repository.UserRepository;
import com.DariusC9.FlatBillManagerBackend.service.errors.EmailNotUniqueException;
import com.DariusC9.FlatBillManagerBackend.service.errors.UserNotExistException;
import com.DariusC9.FlatBillManagerBackend.service.errors.UsernameNotUniqueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserValidator userValidator;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public void saveNewUser(User newUser) throws RuntimeException {
        List<User> userList = userRepository.fetchAll();
        // check if user name is unique
        boolean isUsernameUnique = userValidator.isUsernameUnique(userList, newUser.getName());
        if (!isUsernameUnique) {
            throw new UsernameNotUniqueException();
        }
        // check if email is unique
        boolean isEmailUnique = userValidator.isEmailUnique(userList, newUser.getName());
        if (!isEmailUnique) {
            throw  new EmailNotUniqueException();
        }
        // encrypt password
        String encriptedPassword = passwordEncoder.encode(newUser.getPassword());
        newUser.setPassword(encriptedPassword);
        // set id of the user
        newUser.setId(UUID.randomUUID());
        userRepository.save(newUser);
    }

    public User login(User user) throws RuntimeException {
        List<User> userList = userRepository.fetchAll();
        User userValidatedByEmail = userValidator.doesUserExist(userList, user.getEmail());
        if (userValidatedByEmail == null) {
            throw new UserNotExistException();
        }
        if (passwordEncoder.matches(user.getPassword(), userValidatedByEmail.getPassword())) {
            return userValidatedByEmail;
        } else {
            throw new UserNotExistException();
        }
    }
}
