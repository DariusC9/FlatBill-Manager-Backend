package com.DariusC9.FlatBillManagerBackend.domain.modelResponse;

public class PrivacyResponse {
    private String privacyText;
    public PrivacyResponse(String privacyText) {
        this.privacyText = privacyText;
    }

    public String getPrivacyText() {
        return privacyText;
    }

    public void setPrivacyText(String privacyText) {
        this.privacyText = privacyText;
    }
}
