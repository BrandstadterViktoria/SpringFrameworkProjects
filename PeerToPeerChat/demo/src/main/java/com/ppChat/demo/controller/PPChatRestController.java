package com.ppChat.demo.controller;
import com.ppChat.demo.model.Input;
import com.ppChat.demo.model.Message;
import com.ppChat.demo.model.ResponseMessagePPChat401;
import com.ppChat.demo.model.ResponseMessagePPChatOK;
import com.ppChat.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PPChatRestController {
    private final MessageRepository messageRepository;
    private static final String CLIENT_ID = System.getenv("CHAT_APP_UNIQUE_ID");
    private static final String ADDRESS = System.getenv("CHAT_APP_PEER_ADDRESSS");


    @Autowired
    public PPChatRestController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;

    }

    @PostMapping("/api/message/receive")
    public Object receiveMessage(@RequestBody Input input) {
        ResponseMessagePPChat401 responseMessagePPChat401 = new ResponseMessagePPChat401();
        if (input.getMessage().getId() == 0L || input.getMessage().getId() == null) {
            responseMessagePPChat401.setMessage("Missing field(s) : message.id");
            System.out.println(responseMessagePPChat401);
            return responseMessagePPChat401;
        }
        if (input.getMessage().getUsername().isEmpty()) {
            responseMessagePPChat401.setMessage("Missing field(s) : message.username");
            return responseMessagePPChat401;
        }
        if (input.getMessage().getText().isEmpty()) {
            responseMessagePPChat401.setMessage("Missing field(s) : message.text");
            return responseMessagePPChat401;
        }
        if (input.getMessage().getTimestamp().equals(null)) {
            responseMessagePPChat401.setMessage("Missing field(s) : message.timestamp");
            return responseMessagePPChat401;
        } else {
            Message message = input.getMessage();
            messageRepository.save(message);
            return new ResponseMessagePPChatOK();
        }
    }
}
