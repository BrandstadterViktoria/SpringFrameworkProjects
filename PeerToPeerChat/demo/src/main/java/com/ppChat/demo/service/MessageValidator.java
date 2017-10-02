package com.ppChat.demo.service;

import com.ppChat.demo.model.MessageForUse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageValidator {
   
    List<String> missingProperties;

    public MessageValidator() {

    }

    public MessageValidator(List<String> missingProperties) {
        this.missingProperties = new ArrayList<>();
        this.missingProperties = missingProperties;
        missingProperties.add("Missing field(s): , ");
    }

    public List<String> getMissingProperties() {
        return missingProperties;
    }

    public void setMissingProperties(List<String> missingProperties) {
        this.missingProperties = missingProperties;
    }

    public List<String> validate(MessageForUse messageForUse) {
        List<String> resultOfValidation = new ArrayList<>();
        if (messageForUse.getMessage().getId() == 0L || messageForUse.getMessage().getId() == null) {
            String first = "message.id";
            resultOfValidation.add(first);
        }
        if (messageForUse.getMessage().getUsername().isEmpty()) {
            String second = "message.username";
            resultOfValidation.add(second);
        }
        if (messageForUse.getMessage().getText().isEmpty()) {
            String third = "message.text";
            resultOfValidation.add(third);
        }
        if (messageForUse.getMessage().getTimestamp().equals(null)) {
            String fourth = "message.timestamp";
            resultOfValidation.add(fourth);
        }
        if (messageForUse.getUser().getName().isEmpty()) {
            String fifth = "client.id";
            resultOfValidation.add(fifth);
        }

        return resultOfValidation;

    }
}
