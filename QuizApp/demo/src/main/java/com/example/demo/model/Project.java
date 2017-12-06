package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table (name = "Project")
public class Project {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String projectString;

    public Project() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectString() {
        return projectString;
    }

    public void setProjectString(String projectString) {
        this.projectString = projectString;
    }
}
