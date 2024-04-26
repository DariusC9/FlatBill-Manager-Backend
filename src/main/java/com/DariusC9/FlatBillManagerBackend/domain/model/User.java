package com.DariusC9.FlatBillManagerBackend.domain.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String password;

    public User() {}
    public User(String name, String password) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
