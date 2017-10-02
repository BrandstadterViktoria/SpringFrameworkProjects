package com.ppChat.demo.service;

import com.ppChat.demo.model.MessageForUse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageValidator {
    private String first = "";
    private String second = "";
    private String third = "";
    private String fourth = "";
    private String fifth = "";
    List<String> missingProperties;

    public MessageValidator() {
        this.missingProperties = new ArrayList<>();
        missingProperties.add("Missing field(s): , ");
    }

    public List<String> getMissingProperties() {
        return missingProperties;
    }

    public void setMissingProperties(List<String> missingProperties) {
        this.missingProperties = missingProperties;
    }

    public void validate(MessageForUse messageForUse) {
        if (messageForUse.getMessage().getId() == 0L || messageForUse.getMessage().getId() == null) {
            first = "message.id";
            missingProperties.add(first);
        }
        if (messageForUse.getMessage().getUsername().isEmpty()) {
            second = "message.username";
            missingProperties.add(second);
        }
        if (messageForUse.getMessage().getText().isEmpty()) {
            third = "message.text";
            missingProperties.add(third);
        }
        if (messageForUse.getMessage().getTimestamp().equals(null)) {
            fourth = "message.timestamp";
            missingProperties.add(fourth);
        }
        if (messageForUse.getUser().getName().isEmpty()) {
            fifth = "client.id";
            missingProperties.add(fifth);
        }

    }
}
