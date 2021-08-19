package com.sda.inheritance;

public class Child extends Parent{
    private int age;

    public Child(String username, String email, int age) {
        // super -> echivalentul lui "this" cu mentiunea ca face referire
//                  DOAR la elementele (proprietati, constructor, metode) din parinte

        // se apeleaza constructorul cu cei 2 parametrii din clasa Parent
        super(username, email);

        this.age = age;
    }

    public void printUsernameAndEmail() {
        System.out.println("Username: " + super.getUsername() + ", Email: " + super.getEmail() );
    }
}
