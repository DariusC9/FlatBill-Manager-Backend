package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.repository.UserRepository;
import com.DariusC9.FlatBillManagerBackend.service.errors.EmailNotUniqueException;
import com.DariusC9.FlatBillManagerBackend.service.errors.UsernameNotUniqueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserValidator userValidator;

    public void saveNewUser(User newUser) throws RuntimeException {
        List<User> userList = userRepository.fetchAll();
        boolean isUsernameUnique = userValidator.isUsernameUnique(userList, newUser.getName());
        if (!isUsernameUnique) {
            throw new UsernameNotUniqueException();
        }
        boolean isEmailUnique = userValidator.isEmailUnique(userList, newUser.getName());
        if (!isEmailUnique) {
            throw  new EmailNotUniqueException();
        }
        newUser.setId(UUID.randomUUID());
        userRepository.save(newUser);
    }
}
