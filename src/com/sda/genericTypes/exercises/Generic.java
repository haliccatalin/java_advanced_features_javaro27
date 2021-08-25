package com.sda.genericTypes.exercises;

public class Generic <T>{
    private T value;
    public Generic(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;

    }
}
