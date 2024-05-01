package com.DariusC9.FlatBillManagerBackend.service.errors;

public class UsernameNotUniqueException extends APIError {
    public UsernameNotUniqueException() {
        super("100",
                "The user name is already taken",
                "The user name is already taken. Please use another one.");
    }
}
