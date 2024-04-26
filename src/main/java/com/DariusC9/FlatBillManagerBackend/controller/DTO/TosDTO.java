package com.DariusC9.FlatBillManagerBackend.controller.DTO;

public class TosDTO {
    private String tosText;
    public TosDTO(String tosText) {
        this.tosText = tosText;
    }

    public String getTosText() {
        return tosText;
    }

    public void setTosText(String tosText) {
        this.tosText = tosText;
    }
}
