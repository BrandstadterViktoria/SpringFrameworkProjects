package com.example.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "Answer")
public class Answer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String answerString;

    public Answer() {
    }


    public Answer(String answer) {
        this.answerString = answer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswerString() {
        return answerString;
    }

    public void setAnswer(String answer) {
        this.answerString = answer;
    }
}
