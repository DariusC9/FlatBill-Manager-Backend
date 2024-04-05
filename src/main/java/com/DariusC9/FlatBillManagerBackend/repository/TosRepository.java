package com.DariusC9.FlatBillManagerBackend.repository;

import com.DariusC9.FlatBillManagerBackend.database.TOSData;
import com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces.FetchRepository;
import org.springframework.stereotype.Component;

import java.util.List;
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
}