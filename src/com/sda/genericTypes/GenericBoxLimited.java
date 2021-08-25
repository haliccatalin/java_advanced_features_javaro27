package com.sda.genericTypes;

import com.sda.polymorphism.Animal;

/**
 *  T extends Animal => Permite toata obiectele care extind clasa
 *
 *  Generic box limited accepta doar obiecte ce extind clasa Animal
 *  Ne permite sa facem referire la clasa parinte, adica sa apelam proprietati, metode din clasa Animal
 *
 *  Putem apela doar metodele din clasa PARINTE, daca in copii avem alte metode
 *  nu putem sa le apelam
 */
public class GenericBoxLimited <T extends Animal> {
    private T item;

    public GenericBoxLimited(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public String getAnimalName() {
        return this.item.getName();
    }

    public void hamham() {
        this.item.makeSound();
    }

    // nu putem accesa metodele din copil
    //    public void dogStay() {
//        this.item.stay();
//    }
}
