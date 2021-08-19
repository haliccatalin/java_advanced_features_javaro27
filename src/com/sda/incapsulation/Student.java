package com.sda.incapsulation;

public class Student {
    private String name;
    private String phone; // phone este tot timpul de tipul String;

    public Student() {

    }

    // PARAMETRI: String name, String phone
    public Student(String name, String phone) {
        // this -> face referire la proprietatile clasei, la constructori si la metode.
        // this -> ne ajuta sa facem diferenta intre proprietati si parametri.
        // this -> FACE REFERIRE DOAR LA INTERIORUL CLASEI!!!

        this.name = name;
        this.phone = phone;
    }


    // SETTERII NE AJUTA SA VALIDAM INFORMATIA
    public void setName(String name) {
        if(name.equals("")) {
            System.out.println("Nume invalid!");
        } else{
            this.name = name;
        }

    }

    public String getName() {
        if(this.name == null) {
            return "";
        }

        return this.name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

}
