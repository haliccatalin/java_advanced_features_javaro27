package com.sda.enums;

// Enum => Tip de data
//      => contin constante
//      => constantele pot avea valori
//      => putem avea proprietati, metode, constructori
//      => separare zonei de definire a constantelor se face cu ";"
public enum LengthUnit {
    METER(1),
    INCH(0.025),
    FOOT(0.3); // aici se incheie zona de definire a constantelor

    private double value;

    LengthUnit(double value) {
        this.value = value;
    }

    public double convertToMeter(){
        return this.value;
    }
}
