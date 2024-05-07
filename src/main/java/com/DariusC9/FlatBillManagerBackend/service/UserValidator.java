package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserValidator {
    public boolean isUsernameUnique(List<User> userList, String userName) {
        for (User user: userList) {
            if (user.getName().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmailUnique(List<User> userList, String email) {
        for (User user: userList) {
            if (user.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public User doesUserExist(List<User> userList, String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
