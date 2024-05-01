package com.DariusC9.FlatBillManagerBackend.service.errors;

public class EmailNotUniqueException extends APIError{

    public EmailNotUniqueException() {
        super("101",
                "The email adress is already registered",
                "The email adress is already registered. Please login or try to retrieve the password");
    }
}
