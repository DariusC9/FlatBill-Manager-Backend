package com.DariusC9.FlatBillManagerBackend.repository;

import com.DariusC9.FlatBillManagerBackend.database.TOSData;
import com.DariusC9.FlatBillManagerBackend.database.UserDatabase;
import com.DariusC9.FlatBillManagerBackend.domain.model.User;
import com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces.FetchRepository;
import com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces.SaveRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class UserRepository implements SaveRepository<User>, FetchRepository<User> {
    private UserDatabase data;
    public UserRepository() {
        data = new UserDatabase();
    }
    @Override
    public void save(User object) {
        data.saveUser(object);
    }

    @Override
    public List<User> fetchAll() {
        return data.fetchAll();
    }

    @Override
    public User findById(UUID id) {
        return data.fetchById(id);
    }
}
