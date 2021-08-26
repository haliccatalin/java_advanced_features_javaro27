package com.sda.collections;

import java.util.*;

public class Main {

    // in colectii ca tipuri de date avem DOAR OBIECTE (Integer, Double, Long)!!! NU Primitive (int, float, long, double)!
    public static void main(String[] args) {
//        listDefinition();
//        setDefinition();
//            queueDefinition();
        mapDefinition();
    }

//    List
    public static void listDefinition() {
        // putem initializa interfata List cu clasa ArrayList, pentru ca ArrayList implementeaza interfata List, adica
        // in clasa ArrayList sunt implementate toate metodele din interfata List

//        List<String> namesList = new ArrayList<>();
        List<String> namesList = new LinkedList<>();
//        List<String> namesList = new Vector<>();

        // adaugam un element in lista
        namesList.add("Catalin");

        // de fiecare data cand adaugam un element in lista
        // el se pune pe ultima pozitie din lista (la coada)
        namesList.add("Raul");

        namesList.add("Ana");
        namesList.add("Maria");
        namesList.add("Robert");

        for(int i = 0; i < namesList.size(); i++) {
//            .get(i) => returneaza un element de pe pozitia i;
            String element  = namesList.get(i);

            System.out.println(element);
        }

        System.out.println("----------");

//      foreach:  pentru ficare element din nameList executa {}
        for(String element: namesList) {
            System.out.println(element);
        }

        System.out.println("----------");


        // set(pozitia, obiectul) => ne ajuta sa actualizam un obiect din lista, de pe o pozitie anume
        namesList.set(0, "Daniel");

        // indexOf(obiect) => returneaza pozitia unui element din lista, daca nu il gaseste retuneaza -1
        int pozitie = namesList.indexOf("Raul");
        System.out.println("Pozitia lui Raul este: " + pozitie);

        // size() => echivalentul lui .length pentru array
        //        => ne returneaza numarul de elemente din lista tot timpul numar intreg!!!
        int lungimeLista = namesList.size();

        // remove(int index) => sterge din lista elementul de pe pozitia index, si il returneaza
        String elementSters = namesList.remove(1);
        System.out.println("Element sters: " + elementSters);

        // adaugam element pe pozitia 1
        namesList.add(1, "Raul Inserat");

        // remove(Object obj) => va sterge obiectul specificat, si va returna un boolean true daca a fost sters, false daca nu.
        boolean isRemoved = namesList.remove("Ana");
        System.out.println("Is Removed: " + isRemoved);

        for(String element : namesList) {
            System.out.println(element);
        }

        System.out.println("----------");



//        for(int i = 0; i < namesList.size(); i++) {
//            String temp = namesList.get(i);
//
//            String item = namesList.get(i - 1);
//
//            namesList.set(i, item);
//            namesList.set(i - 1, temp);
//        }


    }

//    Set
    public static void setDefinition() {

        // Set<> => reprezinta o colectie de date,
        // - care nu accepta duplicate!
        // - sunt ordonate "alfabetic/crescator daca e vorba de string" dar nu este o regula
        // - ultimul venit nu este tot timpul si ultimul sosit
        Set<String> namesSet = new HashSet<>();
//        Set<String> namesSet = new LinkedHashSet<>();

        namesSet.add("Andrei");

        namesSet.add("Ana");
        namesSet.add("Ana");
        namesSet.add("Ana");

//        namesSet.add(null);

        for(String name : namesSet) {
            System.out.println(name + " - echivalentul in set: " + name.hashCode());
        }


        int dimensiuneSet = namesSet.size();

        // avem doar metoda de stergere pe baza de obiect
        namesSet.remove("Ana");

        // sterge toate elementele din set
        namesSet.clear();

        // toArray() -> transforma set-ul intr-un array de elemente
         String[] names = (String[]) namesSet.toArray();


         //TreeSet -> este o colectie de date ordonata indiferent de situatie!!!
        Set<String> namesTreeSet = new TreeSet<>();
        namesTreeSet.add("Ana");
        namesTreeSet.remove("Ana");

    }

//    Queue
    public static void queueDefinition() {
        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Charmander");
        // .poll() sterge si afiseaza primul element
        System.out.println(pokemons.poll());

        // .peek() afiseaza primul element din lista, dar nu il sterge
        System.out.println(pokemons.peek());
    }

//    Map
    public static void mapDefinition() {
        // Map<Key, Value> => este un dictionar cheie-valoare, care nu permite duplicat de cheie

        Map<String, String> dictionaryMap = new HashMap<>();

        // put -> adauga un element in Map
        // daca adaug o cheie care este prezenta in map, valoarea celei vechi va fi suprascrisa
        dictionaryMap.put("masina", "mijloc de transport");
        dictionaryMap.put("masina", "obiect cu 4 roti");
        dictionaryMap.put("tractor", "utilaj agricol");
        dictionaryMap.put("camion", "transport marfa");


        // este bine sa verificam daca cheia este prezenta in Map inainte sa adaugam o noua cheie
        if(dictionaryMap.containsKey("masina")) {
            // daca este in map
        } else {
            // daca nu este in map
        }

        // putIfAbsent => verifica daca cheia este prezenta in Map, daca nu atunci o adauga, daca este atunci merge mai departe
        dictionaryMap.putIfAbsent("masina", "un obiect rosu");

        // get() va transforma key in hashcode si acceseaza direct valoare pentru respectiva cheie, nu face un for peste map!
        // apoi returneaza valoarea
        String value = dictionaryMap.get("masina");


        // stergerea unei chei impreuna cu valoarea acesteia
        dictionaryMap.remove("masina");


        // replace va returna valoarea veche pe care a inlocuit-o;
        dictionaryMap.replace("masina", "automobil");


        // sterge key-value din map
//        dictionaryMap.clear();

        // returneaza dimensiunea unui map
//        dictionaryMap.size();


        // varianta 1 afisare map
        // entrySet() => transforma map-ul intr-un set Set<Map.Entry<String, String>> entrySet
        for (Map.Entry<String, String> entry: dictionaryMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());
        }

        Set<Map.Entry<String, String>> entrySet = new HashSet<>();

        System.out.println("------------");
        // de discutat despre iterator!


    }
}
