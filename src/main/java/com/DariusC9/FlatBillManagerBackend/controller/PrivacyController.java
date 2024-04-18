package com.DariusC9.FlatBillManagerBackend.controller;

import com.DariusC9.FlatBillManagerBackend.domain.modelResponse.PrivacyResponse;
import com.DariusC9.FlatBillManagerBackend.domain.modelResponse.TosResponse;
import com.DariusC9.FlatBillManagerBackend.service.PrivacyService;
import com.DariusC9.FlatBillManagerBackend.service.TosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/privacy")
public class PrivacyController {
    @Autowired
    private PrivacyService privacyService;

    @GetMapping
    public ResponseEntity<PrivacyResponse> getTos() {
        String privacyText = privacyService.getPrivacyPolicy();
        PrivacyResponse privacyResponse = new PrivacyResponse(privacyText);
        return ResponseEntity.ok(privacyResponse);
    }

}