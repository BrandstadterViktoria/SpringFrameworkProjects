package com.ppChat.demo.controller;

import com.ppChat.demo.model.Message;
import com.ppChat.demo.model.User;
import com.ppChat.demo.repository.MessageRepository;
import com.ppChat.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PPChatController {

    private UserRepository userRepository;
    private MessageRepository messageRepository;
    private String pPChatErrorMessage;
    private List<Message> messageList;
    private User user;
    private Message message;

    @Autowired
    public PPChatController(UserRepository userRepository, MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
        this.pPChatErrorMessage = "";
        this.messageList = new ArrayList<>();
        this.user = new User();
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("error", pPChatErrorMessage);
        model.addAttribute("messageList", messageList);
        model.addAttribute("user", user);
        model.addAttribute("message",message);
        if (userRepository.count() == 0) {
            return "redirect:/registration";
        } else {
            return "index";
        }
    }

    @GetMapping("/registration")
    public String showRegistration(Model model) {
        model.addAttribute("error", pPChatErrorMessage);
        if (userRepository.count() < 0) {
            return "redirect:/";
        }
        return "registration";
    }

    @RequestMapping("/update")
    public String doUpdate(@RequestParam("name") String userName) {
        if (userName.isEmpty()) {
            pPChatErrorMessage = "The username field is empty.";
            return "redirect:/";
        } else {
            pPChatErrorMessage = "";
            User user = userRepository.findOne(1L);
            user.setName(userName);
            userRepository.save(user);
            return "redirect:/";
        }
    }

    @RequestMapping("/registration/enter")
    public String doRegistration(@RequestParam("name") String name) {
        if (name.isEmpty()) {
            pPChatErrorMessage = "The username field is empty.";
            return "redirect:/";
        } else {
            User user = new User(name);
            userRepository.save(user);
        }
        return "redirect:/";

    }
    @PostMapping("/send")
    public String doSend (@RequestParam ("text") String text){
        Message message = new Message(text);
        message.setUsername(userRepository.findOne(1L).getName());
        messageRepository.save(message);
        messageList.add(message);
        return "redirect:/";
    }

   }

