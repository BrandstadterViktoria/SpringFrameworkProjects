package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfAnswerInput {

    private long id;

    private List<Answer> answerList = new ArrayList<>();

    public ListOfAnswerInput() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
