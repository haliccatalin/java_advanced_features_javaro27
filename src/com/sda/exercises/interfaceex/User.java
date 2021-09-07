package com.sda.exercises.interfaceex;

public class User implements TasksInterface {
    private String username;
    private String phone;

    public User(String username, String phone) {
        this.username = username;
        this.phone = phone;
    }

//    public abstract void printMessage();

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    // Dupa ce implementam interfata TREBUIE sa facem override
    // metodelor abstracte, adica metodelor care nu au bloc de cod
    @Override
    public void createOrder() {
        System.out.println("User create order!");
    }

    @Override
    public void cancelOrder() {
        System.out.println("User cancel order!");
    }
}
