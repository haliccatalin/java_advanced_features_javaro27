package com.sda.exercises.interfaceex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("catalin", "12312312132");
        user.createOrder();
        user.cancelOrder();

        Admin admin = new Admin("Raul");
        admin.createOrder();
        admin.cancelOrder();

        List<TasksInterface> tasksInterfacesList = new ArrayList<>();
        tasksInterfacesList.add(user);
        tasksInterfacesList.add(admin);

        System.out.println("-------------");

        for(TasksInterface tasksInterface : tasksInterfacesList) {
            tasksInterface.createOrder();
        }

        // pentru ca in clasa Admin, sunt implementate toate metodele din
        // interfata
        TasksInterface tasks = new Admin("");

        // putem instantia o interfata sau o clasa abstracta
        // daca suprascriem metodele abstracte din clasa/interfata cu
        // ajutorul claselor/interfetelor ANONIME!
        TasksInterface tasks2 = new TasksInterface() {
            @Override
            public void createOrder() {

            }

            @Override
            public void cancelOrder() {

            }
        };
    }
}
