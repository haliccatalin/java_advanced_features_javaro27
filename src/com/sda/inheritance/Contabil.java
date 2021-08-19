package com.sda.inheritance;

public class Contabil extends Person {
    private String numarRegistru;
    private String numarFacturi;

    public Contabil(String name, String cnp, String numarRegistru, String numarFacturi) {
        super(name, cnp);
        this.numarRegistru = numarRegistru;
        this.numarFacturi = numarFacturi;
    }
}
