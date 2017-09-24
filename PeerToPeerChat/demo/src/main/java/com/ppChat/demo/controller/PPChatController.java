package com.ppChat.demo.controller;

import com.ppChat.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PPChatController {

    private UserRepository userRepository;

    @Autowired
    public PPChatController(UserRepository userRepository) {
        this.userRepository = userRepository;
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
    public String doRegistration () {
    return "redirect:/";
    }


    }
