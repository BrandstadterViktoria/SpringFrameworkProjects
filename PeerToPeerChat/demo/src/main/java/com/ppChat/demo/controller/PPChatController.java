package com.ppChat.demo.controller;

import com.ppChat.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PPChatController {

    private UserRepository userRepository;
    private String pPChatErrorMessage;

    @Autowired
    public PPChatController(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.pPChatErrorMessage = "";
    }

    @GetMapping("/")
    public String index() {
        if (userRepository.count() == 0) {
            return "redirect:/register";
        } else {
            return "index";
        }
    }

    @GetMapping("/registration")
    public String showRegistration () {
        if(userRepository.count() < 0){
            return "redirect:/";
        }
        return "registration";
    }

    @RequestMapping("/registration/enter")
    public String doRegistration (@RequestParam ("name"), String name) {
        if (name.isEmpty()) {
            pPChatErrorMessage = "The username field is empty.";
        }else{
            
        }
    return "redirect:/";
    }
    }
