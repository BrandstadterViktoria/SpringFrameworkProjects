package com.example.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "Answers")
public class Answers {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String question;

    public Answers() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
