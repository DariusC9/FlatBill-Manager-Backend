package com.DariusC9.FlatBillManagerBackend.controller.DTO;

public class PrivacyDTO {
    private String privacyText;
    public PrivacyDTO(String privacyText) {
        this.privacyText = privacyText;
    }

    public String getPrivacyText() {
        return privacyText;
    }

    public void setPrivacyText(String privacyText) {
        this.privacyText = privacyText;
    }
}
