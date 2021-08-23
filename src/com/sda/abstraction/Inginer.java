package com.sda.abstraction;

public class Inginer extends Angajat {

    public Inginer(String name, String phone) {
        super(name, phone);
    }

    // cand extindem o clasa abstracta care contine metode
    // abstracte SUNTEM OBILIGATI  sa suprascriem METODELE ABSTRACTE
    // din clasa parinte

    @Override
    public void startWorking() {
        System.out.println("Inginerul bea cafea!");
    }

    @Override
    public void stopWorking() {
        System.out.println("Inginerul ramane peste program!");
    }
}
