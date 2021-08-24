package com.sda.abstraction.interfaces;


/**
 * - este un tip de data
 * - metodele din interfata sunt publice!!!
 * - interfetele NU se pot INSTANTIA!!! new FisaPostuluiInginer();
 * - nu avem constructori
 * - nu avem proprietati
 * - puteam avea proprietati de tip constante!!!
 * - in interfete toate metodele sunt abstracte prin definitie
 * - o clasa poate sa implementeze o infinitate de interfete
 * - o interfata poate sa fie extinsa (adica avem mostenire si la interfete)
 * - implementarea unei interfete se face cu keywordul "implements"
 */
public interface FisaPostuluiInginer {
//    String name; NU AVEM PROPRIETATI!!!

    // variabila constanta
    final int ID = 0;

    void technicMeet();

    void drawObject();

    void drinkCoffee();

    String getProjectName();

    double calculateHeight();

    // de la Java 8 incoace exista posibilitate de a adauga metode
    // cu bloc de cod!
    // default => NU ESTE MODIFICATORUL DE ACCESS!
    //         => este folosit doar in interfete
    default void printMessage() {
        System.out.println("This is a default method in Interface");
    }

    default int getId() {
        return 0;
    }
}
