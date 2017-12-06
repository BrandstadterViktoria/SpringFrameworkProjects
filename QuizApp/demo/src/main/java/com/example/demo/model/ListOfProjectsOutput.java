package com.example.demo.model;
import java.util.ArrayList;
import java.util.List;

public class ListOfProjectsOutput {


    private List<Project> projectList = new ArrayList<>();

    public ListOfProjectsOutput() {
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}
