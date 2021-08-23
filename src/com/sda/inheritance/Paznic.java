package com.sda.inheritance;

public class Paznic extends Person {
    private boolean openDoor;


    public Paznic(String name, String cnp, boolean openDoor) {
        super(name, cnp);
        this.openDoor = openDoor;
    }

    public void printPaznicName() {
        System.out.println("Paznic name!");
    }

}
