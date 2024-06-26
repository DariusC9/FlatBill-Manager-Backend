package com.DariusC9.FlatBillManagerBackend.controller;

import com.DariusC9.FlatBillManagerBackend.controller.DTO.PrivacyDTO;
import com.DariusC9.FlatBillManagerBackend.service.PrivacyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/privacy")
public class PrivacyController {

    private PrivacyService privacyService;

    public PrivacyController(PrivacyService privacyService) {
        this.privacyService = privacyService;
    }

    @GetMapping
    public ResponseEntity<PrivacyDTO> getTos() {
        String privacyText = privacyService.getPrivacyPolicy();
        PrivacyDTO privacyResponse = new PrivacyDTO(privacyText);
        return ResponseEntity.ok(privacyResponse);
    }
}