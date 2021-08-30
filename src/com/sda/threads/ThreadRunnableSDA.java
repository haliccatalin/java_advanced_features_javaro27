package com.sda.threads;
// Varianta 2 -> implementam interfata Runnable
// este una din cele mai folosite metode, pentru ca poti oricand sa ai
// un parinte pentru aceasta clasa
public class ThreadRunnableSDA implements Runnable {

    // metoda .run() este inima unui Thread
    @Override
    public void run() {
        // - aici se va scrie codul pe care acest Thread il va executa
        // - dupa executia codului Thread-ul se opreste automat
        for(;;) {
            try {
                System.out.println("Thread Runnable");
                Thread.sleep(1000 * 2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
