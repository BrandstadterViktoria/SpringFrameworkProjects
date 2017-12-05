package com.example.demo.controller;

import com.example.demo.model.ListOfAnswerInput;
import com.example.demo.model.ListOfRandomQuestions;
import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static com.example.demo.service.Validator.createQuestions;

@RestController
public class QuizAppRESTController {

//    private QuestionRepository questionRepository;

    @Autowired
//    public QuizAppRESTController(QuestionRepository questionRepository) {
//        this.questionRepository = questionRepository;
    }

    @RequestMapping("/QuizApp")
        public String showHomePage(){
        return "Hello dear Applicant!";
    }

    @GetMapping("/QuizApp/question")
    public ListOfRandomQuestions showQuestions() {
    ListOfRandomQuestions listOfRandomQuestions = createQuestions();
    return listOfRandomQuestions;
    }

    @PostMapping("/QuizApp/answer")
    @NotNull
    public void receiveAnswer(@RequestBody ListOfAnswerInput listOfAnswerInput){


    }


}
