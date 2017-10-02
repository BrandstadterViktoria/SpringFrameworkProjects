package com.ppChat.demo.model;

import java.util.List;

public class ResponseMessagePPChat401 {
    private String status = " error";
    private List<String> missingProperties;

    public ResponseMessagePPChat401(List<String> missingProperties) {
        this.missingProperties = missingProperties;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getMissingProperties() {
        return missingProperties;
    }

    public void setMissingProperties(List<String> missingProperties) {
        this.missingProperties = missingProperties;
    }
}



