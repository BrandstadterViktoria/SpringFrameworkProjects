package com.example.demo.model;

import javax.persistence.*;


@Entity
@Table(name = "QuestionTable")
public class Question {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String question;


    public Question() {
    }

    public Question(String question) {
        this.question = question;
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
