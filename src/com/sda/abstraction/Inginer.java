package com.sda.abstraction;

import com.sda.abstraction.interfaces.FisaPostuluiInginer;

public class Inginer extends Angajat implements FisaPostuluiInginer {

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
}
