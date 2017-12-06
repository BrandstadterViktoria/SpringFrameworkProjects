package com.example.demo.controller;

import com.example.demo.model.ListOfAnswerInput;
import com.example.demo.model.ListOfRandomQuestions;
import com.example.demo.service.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.NotNull;


@RestController
public class QuizAppRESTController {

    private static final String ADDRESS = System.getenv("QUIZ_APP_ADDRESS");

    @Autowired
    private Validator validator;

    public QuizAppRESTController(Validator validator) {
        this.validator = validator;
    }

    @RequestMapping("/QuizApp")
    public String showHomePage() {
        return "Hello dear Applicant!";
    }

    @GetMapping("/QuizApp/question")
    public ListOfRandomQuestions showQuestions() {
        return validator.createQuestions();
    }

    @PostMapping("/QuizApp/answer")
    @NotNull
    public void receiveAnswer(@RequestBody ListOfAnswerInput listOfAnswerInput) {
        RestTemplate restTemplate = new RestTemplate();
        validator.validateAnswers(listOfAnswerInput);
        if (validator.validateAnswers(listOfAnswerInput)) {
            System.out.println("Answers are correct");
        } else { restTemplate.postForObject()

        }
    }
}
