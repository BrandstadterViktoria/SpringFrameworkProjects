package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfAnswerInput {

    private long id;

    private List<Answer> questions = new ArrayList<>();

    public ListOfAnswerInput() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Answer> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Answer> questions) {
        this.questions = questions;
    }
}
