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

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
