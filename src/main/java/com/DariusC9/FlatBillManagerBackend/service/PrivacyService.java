package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.repository.PrivacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivacyService {
    @Autowired
    private PrivacyRepository privacyRepository;

    public String getPrivacyPolicy() {
        return privacyRepository.fetchAll().get(0);
    }
}
