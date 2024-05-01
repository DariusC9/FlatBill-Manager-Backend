package com.DariusC9.FlatBillManagerBackend.service.errors;

public abstract class APIError extends RuntimeException {
    private String errorCode;
    private String errorTitle;
    private String errorMessage;

    public APIError(String errorCode, String errorTitle, String errorMessage) {
        this.errorCode = errorCode;
        this.errorTitle = errorTitle;
        this.errorMessage = errorMessage;
    }
}
