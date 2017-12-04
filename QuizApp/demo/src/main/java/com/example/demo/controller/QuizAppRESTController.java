package com.example.demo.controller;

import com.example.demo.model.ListOfRandomQuestions;
import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizAppRESTController {

    private Question question;
    private QuestionRepository questionRepository;

    @Autowired
    public QuizAppRESTController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @RequestMapping("/QuizApp")
        public String showHomePage(){
        return "Hello dear Applicant!";
    }

    @GetMapping("/QuizApp/question")
    public ListOfRandomQuestions showQuestions() {
            List<Question> random = new ArrayList<>();
            for (int i = 0; i <= 5 ; i++) {
                long randomNumber = (long) (Math.random() * 10) + 1;
                Question forList = questionRepository.findOne(randomNumber);
                random.add(forList);
            }
            ListOfRandomQuestions theListOfQuestion = new ListOfRandomQuestions(random);

       return theListOfQuestion;
    }

}
