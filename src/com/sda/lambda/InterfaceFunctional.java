package com.sda.lambda;

// Functinal Interface => se refera la interfete cu o singura metoda!

// * putem avea mai multe metode intr-o interfata functionala DOAR daca au block de cod, adica sunt default.

@FunctionalInterface
public interface InterfaceFunctional {
//    void printMessage(String message);

    String printMessage(String message, String username, int amount);
}
