package com.sda.nestedClasses.staticClass;

public class Bicycle {
    private int maxSpeed = 25;
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public static class Mechanic {

        public void repair(Bicycle bicycle) {
            // nested static class can refer
            // private field of outer class
            bicycle.maxSpeed += 15;
        }
    }
}

