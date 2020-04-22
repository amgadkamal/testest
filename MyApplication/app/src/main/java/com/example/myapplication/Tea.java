package com.example.myapplication;

public class Tea extends CaffeinatedBeverage{
    void brewBeverage(){
        System.out.println("Steeping the tea bag");
    }



    @Override
    boolean wantsLemon(){return true;}

    @Override
    boolean wantsMilk(){return false;}
}
