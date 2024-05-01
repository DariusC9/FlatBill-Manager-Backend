package com.DariusC9.FlatBillManagerBackend.database;

import com.DariusC9.FlatBillManagerBackend.domain.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDatabase {
    private List<User> data;
    public UserDatabase() {

        data = new ArrayList<>();
    }
    public void saveUser(User newUser) {
        data.add(newUser);
        System.out.println(newUser);
    }

    public List<User> fetchAll() {
        return data;
    }

    public User fetchById(UUID id) {
        for (User user : data) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
