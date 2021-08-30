package com.sda.threads;

// Varianta 1 -> extindem clasa Thread
public class ThreadSDA extends Thread {

    // metoda .run() este inima unui Thread
    @Override
    public void run() {
        // - aici se va scrie codul pe care acest Thread il va executa
        // - dupa executia codului Thread-ul se opreste automat

        while(true) {
            try {
                // .sleep() => ne ajuta sa luam o pauza
                // 1000 millis => 1 secunda
                // 1000 * 1 * 60 => 1 minut
                // 1000 * 1 * 60 * 60 => 1 ora
                // 1000 * 1 * 60 * 60 * 24 => 1 zi => ASA NU 86.400.000 millis
                // 1000 * 1 * 60 * 60 * 24 * 7 => 1 saptamana
                // ....
                System.out.println("Thread ");

                Thread.sleep(1000 * 3);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
