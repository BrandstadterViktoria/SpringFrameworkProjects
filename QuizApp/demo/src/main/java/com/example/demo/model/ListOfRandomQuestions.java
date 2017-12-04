package com.example.demo.model;

import java.util.List;

public class ListOfRandomQuestions {

    private long id;

    private List<Question> questions;

    public ListOfRandomQuestions() {
    }

    public ListOfRandomQuestions(long id, List<Question> questions) {
        this.id = id;
        this.questions = generateRandomQuestions();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> generateRandomQuestions(){

        

    }
}
