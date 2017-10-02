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


    public void setName(String name) {
        this.id = name;
    }



    public User(String name) {
        this.id = name;
    }

    public String getName() {
        return id;
    }
}


