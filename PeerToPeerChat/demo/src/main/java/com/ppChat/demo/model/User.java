package com.ppChat.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    private String id;

    public User() {
    }


    public User(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


