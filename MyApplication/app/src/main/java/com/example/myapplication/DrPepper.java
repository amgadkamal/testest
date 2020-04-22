package com.example.myapplication;

public class DrPepper extends CaffeinatedBeverage {


    @Override
    void boilWater() {
        System.out.println("Heating Dr.Pepper");;
    }

    //no milk
    @Override
    boolean wantsMilk() {return false;}


    @Override
    void brewBeverage() { }

    //add lemon
    @Override
    boolean wantsLemon(){return true;}





}
