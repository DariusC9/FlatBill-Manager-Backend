package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.controller.DTO.UserDTO;
import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User mappToUser(UserDTO userDTO) {
        return new User(userDTO.id(),
                userDTO.name(),
                userDTO.email(),
                userDTO.password());
    }
    public UserDTO mappToUserDTO(User user) {
        return new UserDTO(user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword());
    }
}
