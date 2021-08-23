package com.sda.composition;

public class Cart {

    private Laptop laptop;
    private Keyboard keyboard;

    public Cart(Laptop laptop, Keyboard keyboard) {
        this.laptop = laptop;
        this.keyboard = keyboard;
    }
}
