package com.DariusC9.FlatBillManagerBackend.controller.DTO;

import com.DariusC9.FlatBillManagerBackend.service.errors.APIError;

public class ErrorDTO {
    private String errorCode;
    private String errorTitle;
    private String errorMessage;

    public ErrorDTO() { }

    public ErrorDTO(APIError error) {
        errorCode = error.getErrorCode();
        errorTitle = error.getErrorTitle();
        errorMessage = error.getErrorMessage();
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
