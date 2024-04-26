package com.DariusC9.FlatBillManagerBackend.repository;

import com.DariusC9.FlatBillManagerBackend.database.TOSData;
import com.DariusC9.FlatBillManagerBackend.database.UserDatabase;
import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces.SaveRepository;
import org.springframework.stereotype.Component;

@Component
public class UserRepository implements SaveRepository<User> {
    private UserDatabase data;
    public UserRepository() {
        data = new UserDatabase();
    }
    @Override
    public void save(User object) {
        data.saveUser(object);
    }
}
