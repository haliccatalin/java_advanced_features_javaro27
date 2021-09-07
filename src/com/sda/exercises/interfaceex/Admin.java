package com.sda.exercises.interfaceex;

public class Admin  implements AdminInterface, TasksInterface {
    private String name;

    public Admin(String name) {
        this.name = name;
    }


    @Override
    public void createOrder() {
        System.out.println("Admin create order!");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Admin cancel order!");
    }

    @Override
    public void changePassword() {
        System.out.println("Admin: Change password!");
    }

    @Override
    public void changeUsername() {
        System.out.println("Admin: Change username!");
    }
}
