package com.ppChat.demo.controller;

import com.ppChat.demo.model.*;
import com.ppChat.demo.repository.MessageRepository;
import com.ppChat.demo.service.MessageValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PPChatRestController {
    private final MessageRepository messageRepository;
    private static final String CLIENT_ID = System.getenv("CHAT_APP_UNIQUE_ID");
    private static final String ADDRESS = System.getenv("CHAT_APP_PEER_ADDRESSS");
    private MessageValidator messageValidator;

    @Autowired
    public PPChatRestController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;

    }

    @PostMapping("/api/message/receive")
    public Object receiveMessage(@RequestBody MessageForUse messageForUse) {

        }
    }
}
