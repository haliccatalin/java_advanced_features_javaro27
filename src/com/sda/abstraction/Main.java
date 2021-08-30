package com.sda.abstraction;

import com.sda.abstraction.interfaces.FisaPostuluiInginer;

public class Main {
    public static void main(String[] args) {
        // Clasele Abstracte si Interfetele nu se pot instantia!

        // DAR se pot instantia CU AJUTORUL claselor/interfetelor ANONIME!

        Angajat angajat = new Contabil("","");

        // DE FIECARE DATA CAND DORIM SA FACEM O INSTANTA FOLOSING CLASE/INTERFETE
        // ABSTRACTE SUNTEM OBILIGATI SA IMPLEMENTAM METODELE ABSTRACTE!!!

        Angajat angajatAnonim = new Angajat("Popescu", "3123123123") {

            // angajatAnonim are aceasta proprietate, iar angajatAnonim2 nu o are
            String numeAngajat = "Alex";

            // angajatAnonim are aceasta metoda, iar angajatAnonim2 nu o are
            public void printMessage() {
                System.out.println(numeAngajat);
            }


            @Override
            public void startWorking() {

            }

            @Override
            public void stopWorking() {

            }
        };

        Angajat angajatAnonim2 = new Angajat("Mihail", "1231212") {
            @Override
            public void startWorking() {

            }

            @Override
            public void stopWorking() {

            }
        };

        // INTERFETE ANONIME
        FisaPostuluiInginer fisaPostuluiInginerAnonim = new FisaPostuluiInginer() {
            @Override
            public void technicMeet() {

            }

            @Override
            public void drawObject() {

            }

            @Override
            public void drinkCoffee() {

            }

            @Override
            public String getProjectName() {
                return null;
            }

            @Override
            public double calculateHeight() {
                return 0;
            }
        };

        // apelul metodelor din interfata
        fisaPostuluiInginerAnonim.calculateHeight();
        fisaPostuluiInginerAnonim.getId();
        fisaPostuluiInginerAnonim.drawObject();

        // OBS: putem initializa o interfata cu ajutorul unei clase DOAR DACA clasa implementeaza interfata!
        // Pentru a putea instantia o interfata suntem obligati sa suprascrie metodele din interfata, dar daca o clasa implementeaza deja interfata
        // aceasta clasa are deja suprascrie metodele din interfata, ca urmare o putem folosi la intializare.
        FisaPostuluiInginer fisaPostuluiInginer = new Inginer("Inginer 1", "3123123");


    }
}
