package com.ppChat.demo.service;
import com.ppChat.demo.model.MessageForUse;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageValidator {

    private List<String> missingProperties;
    MessageForUse messageForUse = new MessageForUse();

    public MessageValidator() {
        this.missingProperties = new ArrayList<>();
        this.missingProperties = validate(messageForUse);
    }

    public List<String> getMissingProperties() {
        return missingProperties;
    }

    public void setMissingProperties(List<String> missingProperties) {
        this.missingProperties = missingProperties;
    }

    public List<String> validate(MessageForUse messageForUse) {
        List<String> resultOfValidation = new ArrayList<>();
        resultOfValidation.add("Missing field(s): , ")
        System.out.println(messageForUse.getMessage());
        System.out.println(messageForUse.getUser().getID());
        if (messageForUse.getMessage().getId() == 0L || messageForUse.getMessage().getId() == null) {
            String first = "message.id";
            resultOfValidation.add(first);
        }
        if (messageForUse.getMessage().getUsername().isEmpty()) {
            String second = "message.username";
            resultOfValidation.add(second);
        }
        if (messageForUse.getMessage().getText().isEmpty() || messageForUse.getMessage().getText() == null) {
            String third = "message.text";
            resultOfValidation.add(third);
        }
        if (messageForUse.getMessage().getTimestamp().equals(null)) {
            String fourth = "message.timestamp";
            resultOfValidation.add(fourth);
        }
        if (messageForUse.getUser().getID().isEmpty()) {
            String fifth = "client.id";
            resultOfValidation.add(fifth);
        }

        return resultOfValidation;

    }
}
