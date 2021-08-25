package com.sda.genericTypes;

import com.sda.polymorphism.Animal;
import com.sda.polymorphism.Cat;
import com.sda.polymorphism.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Clasa care nu este generica
        Animal animal = new Animal("Rex");

//        Clasa generica
        GenericBox<String> stringGenericBox = new GenericBox<>("Numele meu");
        System.out.println(stringGenericBox.getItem());

        GenericBox<Double> doubleGenericBox = new GenericBox<>(100.0);
        System.out.println(doubleGenericBox.getItem());

        GenericBox<Animal> animalGenericBox = new GenericBox<>(animal);
//---------------------------------------------------------------
        Animal animalFromGenericBox = animalGenericBox.getItem();
        System.out.println(animalFromGenericBox.getName());
//                                sau
        System.out.println(animalGenericBox.getItem().getName());
//---------------------------------------------------------------

        String[] names = {"Ana", "Ioana", "Maria"};

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Ioana");
        namesList.add("Maria");
//        ...

        ArrayList<Integer> notesList = new ArrayList<>();
        notesList.add(10);
        notesList.add(1);

        ArrayList<Animal> animalsList = new ArrayList<>();


//        Generic box limited accepta doar obiecte ce extind clasa Animal
//        GenericBoxLimited<String> namesGeneric = new GenericBoxLimited<String>();

        Dog rexDog = new Dog("Rex", "ham ham");
        GenericBoxLimited<Dog> dogGenericBoxLimited = new GenericBoxLimited<Dog>(rexDog);

        Cat cat = new Cat("miau");
        GenericBoxLimited<Cat> catGenericBoxLimited = new GenericBoxLimited<Cat>(cat);
    }
}
