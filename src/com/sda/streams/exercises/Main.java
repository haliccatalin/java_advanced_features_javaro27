package com.sda.streams.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Using streams, for a given lists:
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
public class Main {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numberList = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        System.out.println("a) Sort the list");
        namesList.stream()
                .sorted()
//              .forEach((name) -> System.out.println(name));
                .forEach(System.out::println);

        numberList.stream()
                .sorted()
//                .forEach((number) -> System.out.println(number));
                .forEach(System.out::println);

        System.out.println("\nb) Print only those names, that start with 'E' letter.");
        namesList.stream()
                .filter((name) -> name.startsWith("E"))
                .forEach(System.out::println);

        System.out.println("\nc) Print values greater than 30 and lower than 200.");
        numberList.stream()
                .filter((number) -> number > 30 && number < 200)
                .sorted()
                .forEach((number) -> System.out.println(number));

        System.out.println("\nd) Print names uppercase.");


    }
}
