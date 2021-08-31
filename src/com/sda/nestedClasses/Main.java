package com.sda.nestedClasses;

import com.sda.inheritance.Person;
import com.sda.nestedClasses.nonStatic.Bicycle;
import com.sda.nestedClasses.staticClass.Bicycle.Mechanic;

public class Main {
    public static void main(String[] args) {

    }

    public static void nonStaticClasses() {
        // clase non - statice
        Bicycle bicycle = new Bicycle();

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.damage();

        System.out.println(bicycle.getMaxSpeed());

        // clasele non statice definite in interiorul altei clase
        // sunt DEPENDENTE de clasese in care sunt definite.

        // pentru a initializa o clasa non-statica trebuie sa cream un
        // obiect de tipul clasei Radacina (Bicycle) iar apoi sa folosim
        // sintaxa => bicycle.new Wheel() pentru a avea un obiect de tipul Wheel

    }


    public static void staticClasses() {
        // clase statice sunt INDEPENDENTE!!!

        Mechanic mechanic = new Mechanic();
        com.sda.nestedClasses.staticClass.Bicycle bicycle = new com.sda.nestedClasses.staticClass.Bicycle();

        mechanic.repair(bicycle);

        System.out.println(bicycle.getMaxSpeed());


        // exemplu de obiecte care au aceeasi adresa in memorie
        // modificarea unui obiect se propaga la toate 3
//        Person p1 = new Person("Catalin", "21312312");
//        Person p2 = p1;
//        Person p3 = p1;
//        se aloca un nou spatiu in memorie
//        Person p4 = new Person(p3.getName(), p3.getCnp());
//
//        p2.setName("raul");
//        System.out.println(p2.getName());
//
//        System.out.println(p1.getName());
//
//        System.out.println(p3.getName());




    }
}
