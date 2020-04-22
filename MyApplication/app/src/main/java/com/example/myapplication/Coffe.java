package com.example.myapplication;

public class Coffe extends CaffeinatedBeverage {

    void brewBeverage() {
        System.out.println("Dripping coffe through filter");

    }


    @Override
    boolean wantsLemon() {
        return false;
    }

    @Override
    boolean wantsSugar() {
        return true;
    }
}
