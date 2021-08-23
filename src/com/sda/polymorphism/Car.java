package com.sda.polymorphism;

public class Car {
     public int hp;
     public String brand;
     public String color;

     public Car() {

     }

     public Car(String brand) {

     }

     public Car(String brand, String color) {

     }

     public void start() {

     }

     public void start(boolean isWinter) {

     }

//     Nu se tine cont de tipul de data returnat la overload!!!
//     public int start(boolean isWinter) {
//         return 0;
//     }



     public void start(String driverName) {

     }

     public void start(int time, String driver) {

     }

     public void start(String driver, int time) {

     }
}
