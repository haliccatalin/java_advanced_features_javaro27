package com.sda.exceptions;

import java.util.Scanner;

public class Main {
    // Exceptiile (sunt prietenele programatorului)

    // sunt de 2 tipuri
//    1. Throwable => Exceptii de platforma (Environment Exceptions)  (OutOfMemoryException)
//    2. Exception => Exceptii de programare (Runtime Exceptions) (OutOfBoundsException, NullPointerException, etc.)


//    Clasa Exception este copilul clasei Throwable;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        testCnp();

        System.out.println("-----------------------------");


        try {
            // pun metoda in try catch pentru ca stiu ca la un moment dat aceasta poate sa arunce o exceptie
            testCnpThrows();
        } catch (CnpException cnpException) {
            System.out.println("Eroare CNP: " + cnpException.getMessage());

        }

        System.out.println("-----------------------------");


        String name = null;


        // try - catch -> ne ajuta sa gestionam exceptiile fata a opri executia programului.
        //             -> in blocul try {} se scrie codul pentru ne asteptam sa avem o exceptie
        //             -> in catch (Exception e) -> specificam tipul de exceptie pe care dorim sa o gestionam, si modul de gestionare.
        try {
            System.out.println(name.length());

        } catch (Exception e) {
            System.out.println("Numele introdus este invalid!");
        }

        System.out.println("---------------------");

        try {
            name = "catalin";
            System.out.println("Name length: " + name.length());
        } catch (Exception e) {
            System.out.println("Invalid name!");
        } finally {
            // finally -> este blocul de cod care se executa indiferent daca avem sau nu o exceptie
            // finally -> este OPTIONAL!!!
            System.out.println("Finally block code!");
        }

        System.out.println("O zi frumoasa!");


        System.out.println("---------------------");

        try {
//            ArithmeticException
//            int a  = 10 / 0;

//            NullPointerException
//            String sdaCourse = null;
//            System.out.println(sdaCourse.length());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetical exception!!!!");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null pointer excception");
        } catch (Exception e) {
            System.out.println("Alta exceptie!");
        } catch (Throwable t) {
            System.out.println("Necazuri mari!");
        }
        System.out.println("---------------------");


        try {
//            ArithmeticException
//            int a  = 10 / 0;

//            NullPointerException
            String sdaCourse = null;
            System.out.println(sdaCourse.length());
        } catch (ArithmeticException | NullPointerException combineException) {
            System.out.println("Arithmetical or NullPointer exception!!!!");
        } catch (Exception e) {
            System.out.println("Alta exceptie!");
        } catch (Throwable t) {
            System.out.println("Necazuri mari!");
        }
    }

    public static void testCnp() {
        // throw => arunca exceptia si merge direct in catch()
        try {
            String cnp = "8234567890123";

            if (cnp.length() != 13) {
                // aruncam o exceptie
                throw new CnpException("Lungimea cnp-ului este invalida!");
            }

            if (!(cnp.charAt(0) == '1' || cnp.charAt(0) == '2' || cnp.charAt(0) == '3' || cnp.charAt(0) == '4')) {
                throw new CnpException("Genul persoanei este invalid!");
            }
        } catch (CnpException cnpException) {
            System.out.println("Eroare CNP: " + cnpException.getMessage());
        }
    }


    public static void testCnpThrows() throws CnpException {
        // throws => anunta programatorul ca aceasta metoda va arunca la un moment dat o exceptie!!!
        //           pe care trebuie sa o gestionam cu try / catch
        // throws => se scrie doar in semnatura metodei, pentru a marca faptul ca metoda poate arunca o exceptie
        // throws => paseaza exceptia la un nivel mai sus
        String cnp = "8234567890123";

        if (cnp.length() != 13) {
            // cu throw aruncam o exceptie
            throw new CnpException("Lungimea cnp-ului este invalida!");
        }

        if (!(cnp.charAt(0) == '1' || cnp.charAt(0) == '2' || cnp.charAt(0) == '3' || cnp.charAt(0) == '4')) {
            // cu throw aruncam o exceptie
            throw new CnpException("Genul persoanei este invalid!");
        }
    }
}
