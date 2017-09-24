package com.ppChat.demo.controller;

import com.ppChat.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PPChatController {

    private UserRepository userRepository;

    @Autowired
    public PPChatController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/registration")
    public String showRegistration (){

    }
}
