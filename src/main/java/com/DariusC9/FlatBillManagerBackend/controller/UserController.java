package com.DariusC9.FlatBillManagerBackend.controller;

import com.DariusC9.FlatBillManagerBackend.controller.DTO.ErrorDTO;
import com.DariusC9.FlatBillManagerBackend.controller.DTO.UserDTO;
import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.service.UserService;
import com.DariusC9.FlatBillManagerBackend.service.errors.APIError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signUp")
    public ResponseEntity<?> signUpNewUser(@RequestBody UserDTO newUser) {
        try {
            userService.saveNewUser(newUser);
            return ResponseEntity.status(HttpStatus.CREATED).body(null);
        } catch (APIError ex) {
            ErrorDTO error = new ErrorDTO(ex);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserDTO newUser) {
        try {
            UserDTO user = userService.login(newUser);
            return ResponseEntity.ok(user);
        } catch (APIError ex) {
            ErrorDTO error = new ErrorDTO(ex);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }
}
