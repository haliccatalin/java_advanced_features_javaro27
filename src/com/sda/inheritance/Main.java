package com.sda.inheritance;

public class Main {
    public static void main(String[] args) {
        // Relatia de mostenire se realizeaza prin keywordul "extends"
        // In java o clasa copil poate avea UN SINGUR PARINTE!
        // Un parinte poate avea O INFINITATE DE CLASE COPIL
        // CLASA COPIL mosteneste codul din clasa parinte, adica are acces la metode, proprietati, constructori



        Child child1 = new Child("cata.halic", "catalin@gmail.com", 10);
        child1.printUsernameAndEmail();

        child1.setUsername("raul.catalin");

        child1.printUsernameAndEmail();

        Parent parent1 = new Parent("popescu", "mihai@gmail.com");

        CaineDePaza caineDePaza1 = new CaineDePaza("Rex", "132412312", false, "rosie");

        caineDePaza1.getName();

        // ASA DA

        // Un parinte poate sa fie initializat cu o clasa copil, pentru ca un copil contine tot ce contine parintele + alte elemente
        Parent p1 = new Child("catalin", "test@gest.com", 20);


        // ASA NU
        // Un copil nu poate fi initializat cu un parinte, pentru ca parintele nu contine ce contine copilul.
//        Child c1 = new Parent("test", "test@gmail.com");

    }
}
