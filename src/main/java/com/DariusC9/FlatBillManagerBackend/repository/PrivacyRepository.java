package com.DariusC9.FlatBillManagerBackend.repository;
import com.DariusC9.FlatBillManagerBackend.repository.repoInterfaces.FetchRepository;
import com.DariusC9.FlatBillManagerBackend.database.PrivacyData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrivacyRepository implements FetchRepository<String> {
    private PrivacyData data;
    public PrivacyRepository() {
        data = new PrivacyData();
    }
    @Override
    public List<String> fetchAll() {
        return data.getData();
    }
}
