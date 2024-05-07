package com.DariusC9.FlatBillManagerBackend.repository;
import com.DariusC9.FlatBillManagerBackend.database.TOSData;
import com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces.FetchRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class TosRepository implements FetchRepository<String> {
    private TOSData data;
    public TosRepository() {
        data = new TOSData();
    }
    @Override
    public List<String> fetchAll() {
        return data.getData();
    }

    @Override
    public String findById(UUID id) {
        return null;
    }
}