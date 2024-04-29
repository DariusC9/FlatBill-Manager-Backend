package com.DariusC9.FlatBillManagerBackend.database;

import com.DariusC9.FlatBillManagerBackend.domain.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<User> data;
    public UserDatabase() {

        data = new ArrayList<>();
    }
    public void saveUser(User newUser) {
        data.add(newUser);
        System.out.println(newUser);
    }
}
