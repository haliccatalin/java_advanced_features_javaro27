package com.sda.polymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Clasa Animal!");
        System.out.println("Make sound!");
    }

    public String getName() {
        return this.name;
    }
}
