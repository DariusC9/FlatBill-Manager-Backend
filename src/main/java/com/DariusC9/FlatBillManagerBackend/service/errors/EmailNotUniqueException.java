package com.DariusC9.FlatBillManagerBackend.service.errors;

public class EmailNotUniqueException extends RuntimeException{
    public EmailNotUniqueException() {
        super("Email is not unique.");
    }
    public EmailNotUniqueException(String message) {
        super(message);
    }
}
