package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizAppRESTController {

    private Question question;
    private QuestionRepository questionRepository;

    @Autowired
    public QuizAppRESTController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping("/question")
    public void showQuestions() {


    }

}
