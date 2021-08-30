package com.sda.threads;

// Thread -> Sau fire de executie!
public class Main {

//    MainThread => main
    public static void main(String[] args) {
//        2 Modalitati de crea un thread
//        - folosind clasa Thread
//        - folosing interfata Runnable


//        extindem clasa Thread
        ThreadSDA threadSDA = new ThreadSDA();
//        NU Metoda RUN -> threadSDA.run()
        threadSDA.start();

        // implementam interfata Runnable
        ThreadRunnableSDA threadRunnableSDA = new ThreadRunnableSDA();
        Thread threadWithRunnable = new Thread(threadRunnableSDA);
//                              sau
//        Thread threadWithRunnable = new Thread(new ThreadRunnableSDA());


        threadWithRunnable.start();

    }
}
