package com.ppChat.demo.model;

public class ResponseMessagePPChatOK {
    private String status;

    public ResponseMessagePPChatOK() {
    }

    public ResponseMessagePPChatOK(String status) {
        this.status = status;
    }

    public ResponseMessagePPChatOK(String status, String message) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
