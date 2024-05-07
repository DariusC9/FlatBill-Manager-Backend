package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.repository.PrivacyRepository;
import org.springframework.stereotype.Service;

@Service
public class PrivacyService {

    private PrivacyRepository privacyRepository;
    public PrivacyService(PrivacyRepository privacyRepository) {
        this.privacyRepository = privacyRepository;
    }

    public String getPrivacyPolicy() {
        return privacyRepository.fetchAll().get(0);
    }
}
