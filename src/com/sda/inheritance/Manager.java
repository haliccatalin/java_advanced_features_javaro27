package com.sda.inheritance;

public class Manager extends Person {
    private String projectName;

    public Manager(String name, String cnp, String projectName) {
        super(name, cnp);
        this.projectName = projectName;
    }
}
