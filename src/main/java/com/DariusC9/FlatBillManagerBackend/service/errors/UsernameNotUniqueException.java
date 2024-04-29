package com.DariusC9.FlatBillManagerBackend.service.errors;

public class UsernameNotUniqueException extends RuntimeException {
    public UsernameNotUniqueException() {
        super("Username is not unique.");
    }
    public UsernameNotUniqueException(String message) {
        super(message);
    }
}
