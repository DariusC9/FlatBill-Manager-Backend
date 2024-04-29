package com.DariusC9.FlatBillManagerBackend.controller;

import com.DariusC9.FlatBillManagerBackend.controller.DTO.ErrorDTO;
import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.service.UserService;
import com.DariusC9.FlatBillManagerBackend.service.errors.EmailNotUniqueException;
import com.DariusC9.FlatBillManagerBackend.service.errors.UsernameNotUniqueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<?> signUpNewUser(@RequestBody User newUser) {
        try {
            userService.saveNewUser(newUser);
            return ResponseEntity.status(HttpStatus.CREATED).body(null);
        } catch (UsernameNotUniqueException ex) {
            ErrorDTO error = new ErrorDTO("100",
                    "The user name is already taken",
                    "The user name is already taken. Please use another one.");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        } catch (EmailNotUniqueException ex) {
            ErrorDTO error = new ErrorDTO("101",
                    "The email adress is already registered",
                    "The email adress is already registered. Please login or try to retrieve the password");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }
}
