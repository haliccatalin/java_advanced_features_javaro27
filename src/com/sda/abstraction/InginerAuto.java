package com.sda.abstraction;

import com.sda.abstraction.interfaces.FisaPostuluiInginer;
import com.sda.abstraction.interfaces.FisaPostuluiInginerAuto;

public class InginerAuto extends Angajat implements FisaPostuluiInginer, FisaPostuluiInginerAuto {

    public InginerAuto(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void startWorking() {

    }

    @Override
    public void stopWorking() {

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

    @Override
    public void checkCar() {

    }

    @Override
    public void driveTestCar() {

    }
}
