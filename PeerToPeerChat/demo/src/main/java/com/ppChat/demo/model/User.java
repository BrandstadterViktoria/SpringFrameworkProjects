package com.ppChat.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    private String name;

    public User() {
    }

    public User(Long id) {

    }

    public void setName(String name) {
        this.name = name;
    }



    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


