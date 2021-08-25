package com.sda.genericTypes.exercises;
/*
1. Create a Person class that will implement a Comparable interface.
 Person class should implement compareTo method, that will verify if one person is taller than another.
2. Create a simple Generic class, that will give a possibility, to store any kind of value within.
Add object of type String, Integer and Double to array of that Generic type. Print all values of the array within a loop.
 */
public class Main {
    public static void main(String[] args) {
        Person popescu = new Person("Popescu",1.80);
        Person georgescu = new Person("Georgescu",1.70);
        int result = popescu.compareTo(georgescu.getHeight());
        System.out.println(result);


        Generic <String> stringGeneric = new Generic<>("Mihai");
        Generic <Integer> integerGeneric = new Generic<>(100);
        Generic <Double> doubleGeneric = new Generic<>(1.2);
        Generic[] generics = {stringGeneric,integerGeneric,doubleGeneric};
        for (int i = 0;i < generics.length;i++){
            System.out.println(generics[i].getValue());
        }

    }

}
