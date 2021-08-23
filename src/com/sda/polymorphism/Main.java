package com.sda.polymorphism;

public class Main {

    // POLYMORPHISM
    // 1. OVERRIDE
    // 2. OVERLOAD
    // 3. Faptul ca obiectele pot lua mai multe forme

    public static void main(String[] args) {
        Animal animal1 = new Animal("rex");
        animal1.makeSound();

        Dog patrocle = new Dog("patrocle", "woof");
        patrocle.makeSound();

        // exemplu pentru punctul 3.
        Animal animal = new Dog("Rex", "ham ham");

        // OVERLOAD => ne permite sa avem mai multe metode cu acelasi nume
        //             dar cu numar si tip diferit de parametri sau ordinea parametrilor sa fie diferita (vezi clasa car)

        // OVERRIDE => ne permite suprascrierea unei metode din clasa parinte in clasa copil
//                       adica putem schimba functionalitatea unei metode (codul din metoda aflata in parinte)
    }




}
