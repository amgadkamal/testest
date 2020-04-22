package com.example.myapplication;

public abstract class CaffeinatedBeverage {

    final  String prepareRecipe(){

        getMug();
        brewBeverage();
        pourInCup();
        boilWater();

        if (wantsLemon()){
            addLemon();}

        if (wantsSugar()){
            addSugar();}

        if (wantsMilk()){
            addMilk();}

        return prepareRecipe();

     }
    abstract void brewBeverage();
    boolean wantsLemon(){return false;}
    boolean wantsMilk(){return true;}
    boolean wantsSugar(){return true;}



    final void addLemon(){
        System.out.println("Adding lemon"); }

    final void addSugar(){
        System.out.println("Adding sugar"); }

    final void addMilk(){
        System.out.println("Adding milk");    }

    final void getMug(){
        System.out.println("Got mug"); }

    void boilWater(){
        System.out.println("Boiling water"); }

    final void pourInCup(){
        System.out.println("Pouring in cup"); }


}
