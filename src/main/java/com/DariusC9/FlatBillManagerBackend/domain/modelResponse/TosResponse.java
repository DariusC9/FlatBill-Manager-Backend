package com.DariusC9.FlatBillManagerBackend.domain.modelResponse;

import java.security.PublicKey;

public class TosResponse {
    private String tosText;
    public TosResponse(String tosText) {
        this.tosText = tosText;
    }

    public String getTosText() {
        return tosText;
    }

    public void setTosText(String tosText) {
        this.tosText = tosText;
    }
}
