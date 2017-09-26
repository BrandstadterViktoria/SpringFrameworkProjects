package com.ppChat.demo.model;

public class ResponseMessagePPChat {
    private String status;
    private String message;

    public ResponseMessagePPChat(String status) {
        this.status = status;
    }

    public ResponseMessagePPChat(String status, String message) {
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
