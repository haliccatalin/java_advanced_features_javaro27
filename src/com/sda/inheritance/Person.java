package com.sda.inheritance;

public class Person {
    private String name;
    private String cnp;

    public Person(String name, String cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    public String getName() {
        return this.name;
    }

    public void printPersonName() {
        System.out.println(this.name);
    }
}
