package com.sda.exercises.interfaceex;

public interface TasksInterface {
    void createOrder();

    void cancelOrder();

    default String trimString(String str) {
        return str.trim();
    }
}
