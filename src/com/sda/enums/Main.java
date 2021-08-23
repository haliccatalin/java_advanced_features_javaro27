package com.sda.enums;

public class Main {
    public static void main(String[] args) {

        // Obiect  nume_variabila = valoare
        LengthUnit unit = LengthUnit.METER;
//        int option = 2;

        switch (unit) {
//            case 1:
            case FOOT: {
                System.out.println("This is FOOT");
                break;
            }

//            case 2:
            case INCH: {
                System.out.println("This is INCH");
                break;
            }

//            case 3
            case METER: {
                System.out.println("This is METER");
                break;
            }

            default: {
                System.out.println("See you soon!");
            }
        }

        LengthUnit[] items = LengthUnit.values();

        for (LengthUnit lengthUnit : items) {
            System.out.println(lengthUnit);
            System.out.println(lengthUnit.convertToMeter());
        }
    }
}
