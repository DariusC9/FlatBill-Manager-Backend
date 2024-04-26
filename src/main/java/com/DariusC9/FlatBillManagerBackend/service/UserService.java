package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void saveNewUser(User newUser) {
        userRepository.save(newUser);
    }
}
