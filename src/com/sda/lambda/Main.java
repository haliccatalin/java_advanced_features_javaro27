package com.sda.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    // Lambda Exrepssion <=> Functional Interface

    // Lambda ne ajuta sa scriem mai putin cod, iar codul nostru sa fie mai concentrat si mai usor de citit
    public static void main(String[] args) {

//        // Interfata anonima!
//        InterfaceFunctional interfaceFunctional = new InterfaceFunctional() {
//            @Override
//            public void printMessage(String message) {
//                System.out.println("Mesajul din interfata: " + message);
//            }
//        };
//
//        interfaceFunctional.printMessage("Buna eu sunt interfata!");

        // Interfata Functionala
//        InterfaceFunctional interfaceFunctionalLambda = (message) -> System.out.println("Lambda: " + message);
//        InterfaceFunctional interfaceFunctionalLambda2 = (message) -> {
//            System.out.println("Lambda: " + message);
//            System.out.println("Bun venit!");
//        };
//
//        interfaceFunctionalLambda.printMessage("Interfata apelata cu lambda");


        // Daca metoda din interfata returneaza un obiect (sau primitiva) atunci avem 2 cazuri
        // cazul 1: o singura linie de cod, nu folosim return;
        InterfaceFunctional interfaceFunctional = (message, username, amount) -> message + " " + username + " " + amount;
        System.out.println(interfaceFunctional.printMessage("Bun venit, ", "Ionel", 1));

        // cazul 2: mai multe linii de cod, la finalul codului trebuie sa avem un return;
        interfaceFunctional = (message, username, amount) -> {
            System.out.println(message);
            System.out.println(username);
            System.out.println(amount);

            return "Date invalide!";
        };

        System.out.println(interfaceFunctional.printMessage("Ai de plata", "catalin" , 100));

        List<String> namesList = new ArrayList<>();

        namesList.add("Ionel");
        namesList.add("Dan");
        namesList.add("Mihai");
        namesList.add("Ioana");
        namesList.add("Maria");
        namesList.add("Ana");

        for(String name : namesList) {
            System.out.println(name);
        }

        for(int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        System.out.println("---------------------");

        int contor = 0;
        while (contor < namesList.size()) {
            System.out.println(namesList.get(contor));
            contor++;
        }


        namesList.forEach((name) -> System.out.println(name));

        System.out.println("---------------------");

        predicateSample();


    }

    public static void predicateSample() {
        // Predicate -> ne ajuta sa validam o informatie, trebuie sa suprascriem metoda test() care returneaza un boolean true / false
        Predicate<String> isTodayFriday = (dayOfWeek) -> dayOfWeek.equals("Friday");


        // dayOfWeek -> este parametrul metodei test din interfata predicate (vezi linia 91)
        Predicate<String> isTodayFriday2 = (dayOfWeek) -> {
            System.out.println("Validate info");
            return dayOfWeek.equals("Friday");
        };

        System.out.println(isTodayFriday.test("Friday"));
    }
}

class TestPredicate implements Predicate<String> {
    @Override
    public boolean test(String dayOfWeek) {
        return dayOfWeek.equals("Friday");
    }
}
