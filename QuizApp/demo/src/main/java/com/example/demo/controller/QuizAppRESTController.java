package com.example.demo.controller;

import com.example.demo.model.ListOfAnswerInput;
import com.example.demo.model.ListOfProjectsOutput;
import com.example.demo.model.ListOfRandomQuestions;
import com.example.demo.model.Project;
import com.example.demo.service.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@RestController
public class QuizAppRESTController {

    private static final String ADDRESS = System.getenv("QUIZ_APP_ADDRESS");
    private static final String theHighlyAwaitedProjectList = System.getenv("QUIZ_APP_Project_LIST");

    @Autowired
    private Validator validator;
    private ListOfProjectsOutput listOfProjectsOutput;


    public QuizAppRESTController(Validator validator, ListOfProjectsOutput listOfProjectsOutput) {
        this.validator = validator;
        this.listOfProjectsOutput = listOfProjectsOutput;
    }

    @RequestMapping("/QuizApp")
    public String showHomePage() {
        return "Hello dear Applicant!";
    }

    @GetMapping("/QuizApp/question")
    public ListOfRandomQuestions showQuestions() {
        return validator.createQuestions();
    }

    @GetMapping("/QuizApp/answer")
    public  ListOfProjectsOutput sendListOfProjects (@RequestBody ListOfProjectsOutput listOfProjectsOutput){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(ADDRESS,
    }

    @PostMapping("/QuizApp/answer")
    @NotNull
    public void receiveAnswer(@RequestBody ListOfAnswerInput listOfAnswerInput) {
        validator.validateAnswers(listOfAnswerInput);
        if (validator.validateAnswers(listOfAnswerInput)) {

        } else {

        }

    }


}
