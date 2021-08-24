package com.sda.abstraction;

/**
 * abstract -> ne permite sa definim o clasa abstracta
 *          -> ne permite sa avem metode fara bloc de cod (functionalitate)
 *
 * Clase Abstracte
 * - o clasa abstracta este o clasa tip sablon
 * - clasa abstracta de regula se foloseste pe post de parinte pentru alte clase
 * - clasa abstracta nu poate fi INSTANTIATA!!! NU PUTEAM AVEA new Angajat()
 * - pot avea proprietati
 * - pot avea constructori
 * - pot avea metode cu bloc de cod
 *
 *         Clasa Normala              vs.       Clasa Abstracta
 *    - nu avem metode abstracte               - avem metode abstracte fara bloc de cod
 *    - avem instanta de clasa new Class()     - nu avem instanta de clasa!
 *    - avem proprietati                       - avem proprietati
 *    - metode                                 - metode
 *    - constructori                           - constructori
 */

// com.sda.abstraction.Angajat.java
public abstract class Angajat {
    private String name;
    private String phone;

    // static -> aloca spatiu in memorie la rularea aplicatie
//            -> daca avem 100 de obiecte de tipul Angajat, toate cele 100 de obiecte vor avea un singur ID
//            - adica,daca din 100 de obiecte luam unul si ii modificam ID-ul = 10, toate obiectele vor avea ID = 10;
//            - static se aplica si in cadrul metodelor, claselor
    public static int ID = 0;

    public Angajat(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // metoda abstracta => se numeste asa pentru ca nu are bloc de cod!
    public abstract void startWorking();

    public abstract void stopWorking();

    public void payday() {
        System.out.println("In data de 10 a lunii se vireaza banii!");
    }
}
