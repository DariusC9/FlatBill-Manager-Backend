package com.DariusC9.FlatBillManagerBackend.service;

import com.DariusC9.FlatBillManagerBackend.repository.TosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TosService {
    @Autowired
    private TosRepository tosRepository;

    public String getTermsOfService() {
        return tosRepository.fetchAll().getFirst();
    }
}
