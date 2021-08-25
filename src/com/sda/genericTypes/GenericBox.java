package com.sda.genericTypes;

/**
 * <T> - identificam o clasa generica
 * <K,V> - identificam o clasa generica (key, value)
 * <K> - identificam o clasa generica (key)
 * <E> - identificam o clasa generica (element)
 * <V> - identificam o clasa generica (value)
 * Daca folosim <T> in interiorul clasei, aceasta va accepta doar obiecte de tipul T, adica GenericBox<String> va accepta
 * doar obiecte de tip string
 * GenericBox nu influentiaza elemente generice din clasa
 * Cand definim un GenericBox -> nu facem referire la tipul de obiect pe care il vom avea
 */
//public class GenericBox {
public class GenericBox<T> {

//    private String item;
    private T item;

//    public GenericBox(String item) {
    public GenericBox(T item) {
        this.item = item; // va pastra adresa din memorie
//        this.item = new Object(); // new -> creea o noua adresa in memorie pentru un nou obiect
    }

//    public String getItem() {
    public T getItem() {
        return this.item;
    }

//    ASA NU!!!!
//    public void split() {
//        T.split()
//    }

//    public void setItem(String item) {
    public void setItem(T item) {
        this.item = item;
    }
}
