package com.ppChat.demo.controller;

import com.ppChat.demo.model.Input;
import com.ppChat.demo.model.Message;
import com.ppChat.demo.model.ResponseMessagePPChatOK;
import com.ppChat.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PPChatRestController {
    private final MessageRepository messageRepository;
    private final ResponseMessagePPChatOK responseMessagePPChatOK;

    @Autowired
    public PPChatRestController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        this.responseMessagePPChatOK = new ResponseMessagePPChatOK();
    }

    @PostMapping("/api/message/receive")
    public Object receiveMessage(@RequestBody Input input) {
        Message message = input.getMessage();
        messageRepository.save(message);
        return new ResponseMessagePPChatOK();
    }
}
