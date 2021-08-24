package com.sda.composition;

public class Cart {

//    Agregarea si Compunere
    String compunere = new String("Ana are mere");
    String agregare;

    private Laptop laptop;
    private Keyboard keyboard;

    public Cart(Laptop laptop, Keyboard keyboard) {
        this.laptop = laptop;
        this.keyboard = keyboard;

        this.agregare = "Ana are multe mere rosi";
    }
}
