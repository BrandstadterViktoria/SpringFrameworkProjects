package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizAppController {

    private Question question;
    private QuestionRepository questionRepository;

    @Autowired
    public QuizAppController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping("/question")
    public void showQuestions() {
        question = questionRepository.findOne(1l);
        System.out.println(question);
    }

}
