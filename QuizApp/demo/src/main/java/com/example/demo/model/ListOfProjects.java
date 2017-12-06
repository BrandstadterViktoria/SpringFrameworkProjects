package com.example.demo.model;
import java.util.ArrayList;
import java.util.List;

public class ListOfProjects {


    private List<Project> projectList = new ArrayList<>();

    public ListOfProjects() {
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
