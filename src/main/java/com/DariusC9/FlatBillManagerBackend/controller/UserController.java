package com.DariusC9.FlatBillManagerBackend.controller;
import com.DariusC9.FlatBillManagerBackend.controller.DTO.TosDTO;
import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.service.TosService;
import com.DariusC9.FlatBillManagerBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public void signUpNewUser(@RequestBody User newUser) {
        userService.saveNewUser(newUser);
    }
}
