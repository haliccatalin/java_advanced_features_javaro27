package com.sda.composition;

public class Main {
    Keyboard acerKeyboard = new Keyboard(104, "Black", "Acer", "EN");

    Laptop asusNotebook = new Laptop("Asus", 16, 120, 8.0);

    Cart cart = new Cart(asusNotebook, acerKeyboard);

}
