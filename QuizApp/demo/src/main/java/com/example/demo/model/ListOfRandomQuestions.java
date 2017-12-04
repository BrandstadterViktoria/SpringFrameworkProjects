package com.example.demo.model;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListOfRandomQuestions {

    private long id;

    private List<Question> questions = new ArrayList<>();


    public ListOfRandomQuestions() {

    }

    public ListOfRandomQuestions(List<Question> questions) {
        this.questions = questions;
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


}
