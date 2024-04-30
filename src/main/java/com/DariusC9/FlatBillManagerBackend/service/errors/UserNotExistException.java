package com.DariusC9.FlatBillManagerBackend.service.errors;

public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("User does not exist");
    }
    public UserNotExistException(String message) {
        super(message);
    }
}
