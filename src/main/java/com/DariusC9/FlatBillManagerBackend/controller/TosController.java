package com.DariusC9.FlatBillManagerBackend.controller;

import com.DariusC9.FlatBillManagerBackend.controller.DTO.TosDTO;
import com.DariusC9.FlatBillManagerBackend.service.TosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tos")
public class TosController {
    @Autowired
    private TosService tosService;

    @GetMapping
    public ResponseEntity<TosDTO> getTos() {
        String tos = tosService.getTermsOfService();
        TosDTO tosResponse = new TosDTO(tos);
        return ResponseEntity.ok(tosResponse);
    }
}
