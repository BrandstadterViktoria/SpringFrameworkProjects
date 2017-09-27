package com.ppChat.demo.model;

public class ResponseMessagePPChat401 {
    private String status = " error";
    private String message = "Missing field(s) : ";

    public ResponseMessagePPChat401(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
