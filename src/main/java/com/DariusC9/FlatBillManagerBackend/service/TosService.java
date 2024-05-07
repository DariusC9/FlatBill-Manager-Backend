package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.repository.TosRepository;
import org.springframework.stereotype.Service;

@Service
public class TosService {

    private TosRepository tosRepository;

    public TosService(TosRepository tosRepository) {
        this.tosRepository = tosRepository;
    }

    public String getTermsOfService() {
        return tosRepository.fetchAll().get(0);
    }
}
