package com.example.demo.service;
import com.example.demo.model.*;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Validator {

    @Autowired
    private  QuestionRepository questionRepository;
    private  AnswerRepository answerRepository;
    private ListOfRandomQuestions listOfRandomQuestions;

    public Validator() {
    }

    public Validator(ListOfRandomQuestions listOfRandomQuestions) {
        listOfRandomQuestions = createQuestions();
        this.listOfRandomQuestions = listOfRandomQuestions;
    }

    public Validator(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    public ListOfRandomQuestions createQuestions() {
        List<Question> random = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            long randomNumber = (long) (Math.random() * 10) + 1;
            Question forList = questionRepository.findOne(randomNumber);
            random.add(forList);
        }

        return new ListOfRandomQuestions(random);
    }

    public boolean validateAnswers(ListOfAnswerInput listOfAnswerInput) {
        boolean isTheAnswerCorrect = true;
        for (Answer answer : listOfAnswerInput.getAnswerList()) {
            long answerOfGivenAnswer = answer.getId();
            if (answerOfGivenAnswer == listOfRandomQuestions.getId() &&
                    answerRepository.findOne(answerOfGivenAnswer).getAnswerString() == answer.getAnswerString()) {
                isTheAnswerCorrect = true;
            } else isTheAnswerCorrect = false;
        }

        return isTheAnswerCorrect;
    }

    }
}





