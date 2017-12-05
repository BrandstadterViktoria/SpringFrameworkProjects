package com.example.demo.service;
import com.example.demo.model.Answer;
import com.example.demo.model.ListOfAnswerInput;
import com.example.demo.model.ListOfRandomQuestions;
import com.example.demo.model.Question;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Validator {

    @Autowired
    public static QuestionRepository questionRepository;
    private AnswerRepository answerRepository;

    public Validator(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    public static ListOfRandomQuestions createQuestions(){
        List<Question> random = new ArrayList<>();
        for (int i = 0; i <= 5 ; i++) {
            long randomNumber = (long) (Math.random() * 10) + 1;
            Question forList = questionRepository.findOne(randomNumber);
            random.add(forList);
        }

        return new ListOfRandomQuestions(random);
    }




    public static boolean validateAnswers(ListOfAnswerInput listOfAnswerInput){
        for (Answer answer :listOfAnswerInput.getAnswerList()){
            if(answer.getId() ==
        }


        return
    }
}

