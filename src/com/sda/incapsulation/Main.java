package com.sda.incapsulation;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Catalin");
        student1.setPhone("0752031231");

        System.out.println("Name: " + student1.getName());
        System.out.println("Phone: " + student1.getPhone());

        System.out.println("--------------------");

        Student student2 = new Student("Raul", "075012313223");
        System.out.println("Name: " + student2.getName());
        System.out.println("Phone: " + student2.getPhone());

        System.out.println("--------------------");

        student2.setName("");
        System.out.println("Name: " + student2.getName());

    }
}
