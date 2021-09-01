package com.sda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();

        namesList.add("Ion");
        namesList.add("Mihai");
        namesList.add("Dan");
        namesList.add("Maria");
        namesList.add("Mirela");
        namesList.add("Dana");

//        Varianta 1
//        namesList.forEach();


//        Varianta 2
        for(String name : namesList) {
            System.out.println(name);
        }

        System.out.println("-------------------");

//        Varianta 3 - Streams
//        namesList.stream() -> transforma colectia intr-un flux de date
//        Exemplu: o bucata de lemn transformata in rumegus, iar cu rumegusul reusim sa facem diverse operatiuni
        namesList.stream().forEach((name) -> System.out.println(name));


//        Dorim sa obtinem o lista, iar pe fiecare pozitie sa fie dimensiunea numelui din lista de mai sus
//        Varianta Clasica
        List<Integer> nameLengthList = new ArrayList<>();
        for(String name : namesList) {
            nameLengthList.add(name.length());
        }

        for (Integer nameLength: nameLengthList) {
            System.out.println(nameLength);
        }
        System.out.println("-------------------");

//        Varianta cu Streams
        // .map() => ne ajuta sa modificam valorile dintr-o colectie, iar apoi sa putem gestiona mai departe rezultatele
        // .mapToInt() => transfoma elementul de pe fiecare pozitie intr-un Integer
        // .mapToDouble() => transfoma elementul de pe fiecare pozitie intr-un Double
        namesList.stream()
                .mapToInt((name) -> name.length())
                .forEach((nameLength) -> System.out.println(nameLength));

        System.out.println("-------------------");

        namesList.stream()
                .map((name) -> name + " => " + "stream element") // pentru fiecare element din lista adaugam secventa " => stream element"
                .map((name) -> name.toUpperCase()) // pentru fiecare element obtinut mai sus, il transformam in UPPERCASE()
                .forEach((nameLength) -> System.out.println(nameLength));
        System.out.println("-------------------");

        // cautarea cu ajutorul Stream
        for (String name : namesList) {
//            Character firstChar = name.charAt(0);
//
//            if(firstChar == 'D') {
//                System.out.println(name);
//            }

            if(name.startsWith("D")) {
                System.out.println(name);
            }
        }

        System.out.println("-------------------");

        namesList.stream()
                .map((name) -> name.toLowerCase(Locale.ROOT)) // transform numele in litere mici
                .filter((name) -> name.startsWith("d")) // pe lista de  nume transformata, aplicam un filter()
                .map((name) -> {
                    // .substring() ne ajuta sa taiem o secventa de caractere dintr-un string de la 0 la 1
                    String firstLetter = name.substring(0, 1);

                    // am transformat prima litera, din litera mica in litera mare
                    firstLetter = firstLetter.toUpperCase(Locale.ROOT);

                    // am concatenat litera mare cu substring de la pozitia 1 pana la final. De la poziata 1 pentru ca
                    // am exclus prima litera
                    return firstLetter + name.substring(1, name.length()); // avem return pentru ca in corpul metodei map() avem mai multe linii de cod
                })
                .forEach((name) -> System.out.println(name)); // pe lista obtinuta la filter() aplicam un forEach()


        System.out.println("-----------------");
//        String value = "java";
//
//        System.out.println(value.substring(1,3));


        List<String> namesWithM = namesList.stream()
                .filter((name) -> name.startsWith("M"))
                .collect(Collectors.toList()); // .collect(Collectors.toList()) => transforma stream-ul inapoi in lista!

        for (String name : namesWithM) {
            System.out.println(name);
        }

        System.out.println("-----------------");

        // .reduce() - putem concatena stringuri, aduna numere, etc.

        int result = namesList.stream()
                .mapToInt((name) -> name.length())
                .reduce(0, (total, current) -> total + current);

        System.out.println("In lista sunt " + result + " de caractere.");

        System.out.println("-----------------");

        // concatenare de stringuri
        String resultAllNames = namesList.stream()
                .reduce("", (total, current) -> {
            if(total.length() == 0) {
                return total + current;
            } else {
                return total + ", " + current;
            }
        });
        System.out.println(resultAllNames);

        System.out.println("-----------------");

//        .anyMatch() -> daca exista cel putin 1 element care sa indeplineasca conditia
        boolean anyMatchResult = namesList.stream().anyMatch((name) -> name.length() == 5);
        System.out.println("Any Match Result: " + anyMatchResult);


//        .allMatch() -> daca toate elementele indeplinesc conditia
        boolean allMatchResult = namesList.stream().allMatch((name) -> name.length() > 4);
        System.out.println("All Match Result: " + allMatchResult);

        System.out.println("-----------------");

//        .sorted() -> ne ajuta sa sortam elemente din stream, ordoneaza alfabetic
        namesList.stream()
                .sorted()
                .forEach((name) -> System.out.println(name));

        System.out.println("-----------------");

//        .sorted(new Comparator()) -> in exemplu de mai jos lista e ordonata alfabetic de la Z - A
        namesList.stream()
                // .compareTo() - returneaza 0 daca sunt egale
//                              - returneaza -1 daca name1 < name2
//                              - returneaza 1 daca name1 > name2
                .sorted((name1, name2) -> name2.compareTo(name1))
                .forEach((name) -> System.out.println(name));


        System.out.println("-----------------");

//        :: operator
        namesList.stream().forEach((name) -> System.out.println(name));
        // linia de mai jos este o varianta mai scurta pentru linia de mai sus
        namesList.stream().forEach(System.out::println);
    }
    /**
     * Using streams, for a given lists:
     * - [„John”, „Sarah”, „Mark”, „Tyla”, „Ellisha”, „Eamonn”]
     * - [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
     * a) Sort the list.
     * b) Print only those names, that start with „E” letter.
     * c) Print values greater than 30 and lower than 200.
     * d) Print names uppercase.
     * e) Remove first and last letter, sort and print names.
     * f) *Sort backwards by implementing reverse Comparator and using lambda
     * expression.
     */
}
