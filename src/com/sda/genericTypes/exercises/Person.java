package com.sda.genericTypes.exercises;

public class Person implements Comparable<Double>{
    private Double height;
    private String name;
    public Person(String name,Double height){
        this.name = name;
        this.height = height;

    }
    public String getName(){
        return this.name;
    }
    public Double getHeight(){
        return this.height;

    }

    @Override
    public int compareTo(Double inaltimeaCeluilalt) {
        if (this.height < inaltimeaCeluilalt){
            return -1;

        }
        else if (this.height> inaltimeaCeluilalt){
            return 1;
        }
        else {
            return 0;

        }

    }
}
