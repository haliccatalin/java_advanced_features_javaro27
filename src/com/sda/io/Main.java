package com.sda.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();

        namesList.add("Ion");
        namesList.add("Ioana");
        namesList.add("Maria");
        namesList.add("Mihai");
        namesList.add("Dan");
        namesList.add("Mircea");

        // Adresa Relativa (este recomandata, pentru ca este portabila)
        // ./java_advanced_features27/

        // Adresa Absoluta
        // C:/Java/Sda/java_advanced_features27/
        try {
            Files.write(Path.of("fisier-lista-nume.txt"), namesList);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

//        Bucle infinite!!!
//        for(;;) {
//
//        }

//        while(true) {
//
//        }


        try {
            List<String> namesFromFile = Files.readAllLines(Path.of("fisier-lista-nume.txt"));

            System.out.println("Names from file!");
            for(String name : namesFromFile) {
                System.out.println(name);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void writeTextToFile() {
        try {
            // BufferedWriter ne ajuta sa creem un fisier cu un nume si cu o extensie, cu ajutor clasei FileWrite
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text-java.txt"));

            // .write() -> scrie date in buffer care apoi merg in fisier
            bufferedWriter.write("Ana are mere");

            // .close() -> se inchide bufferul in care scriam mai sus
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readTextFromFile() {
        List<String> textLinesList = new ArrayList<>();

        try  {
//            ne ajuta sa citim datele dintr-un fisier
            BufferedReader bufferedReader = new BufferedReader(new FileReader("text-java.txt"));

            String line = "";

//            String urgente = "112";
//            int urgenteInt = 112;

            // line = bufferedReader.readLine() => este null cand se ajunge la finul fisierului,
            // cat timp line este diferit de null se citesc toate liniile din fisier
            while((line = bufferedReader.readLine()) != null) {
                textLinesList.add(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Results:");
        for(String line : textLinesList) {
            System.out.println(line);
        }
    }

    public static void writeObjectToFile() {
        List<String> namesList = new ArrayList<>();

        namesList.add("Ion");
        namesList.add("Ioana");
        namesList.add("Maria");
        namesList.add("Mihai");
        namesList.add("Dan");
        namesList.add("Mircea");

        for(String name : namesList) {
            System.out.println(name);
        }

        try {

//            FileOutputStream => ne ajuta sa cream fiserul
            FileOutputStream fileOutputStream = new FileOutputStream("lista-nume-obiecte.txt");

            // ObjectOutputStream => ne ajuta sa obtinem un flux de date dintr-un obiect
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // .writeObject() => ne ajuta sa scrie un obiect intr-un flux de date
            objectOutputStream.writeObject(namesList);

            // .close() => inchide fluxul de date
            objectOutputStream.close();

            // .close() => salveaza fisierul
            fileOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readObjectFromFile() {
        System.out.println("Read Object From file");

        try {
            // FileInputStream => ne ajuta sa citim din fisier
            FileInputStream fileInputStream = new FileInputStream("lista-nume-obiecte.txt");

            // ObjectInputStream => ne ajuta sa citim obiectele din fisier
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // .readObject() => transformam textul din fisier in obiect
            List<String> nameList = (List<String>) objectInputStream.readObject();

            for(String name : nameList) {
                System.out.println(name);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
