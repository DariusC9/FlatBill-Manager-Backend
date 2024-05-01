package com.DariusC9.FlatBillManagerBackend.service.errors;

public class UserNotExistException extends APIError {
    public UserNotExistException() {
        super("102",
                "The user credentials are not matching",
                "The email adress or the password you input does not match with any user inside the database. Please try again.");
    }
}
