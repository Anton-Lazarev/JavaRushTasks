package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name, address, color;
    private int age, weight;
    private static int DEF_AGE = 4;
    private static int DEF_WEIGHT = 6;
    private static String DEF_COLOR = "brown";

    public Cat(String inName){
        this.name = inName;
        this.address = null;
        this.color = DEF_COLOR;
        this.age = DEF_AGE;
        this.weight = DEF_WEIGHT;
    }

    public Cat(String inName, int inWeight, int inAge){
        this.name = inName;
        this.address = null;
        this.color = DEF_COLOR;
        this.age = inAge;
        this.weight = inWeight;
    }

    public Cat(String inName, int inAge){
        this.name = inName;
        this.address = null;
        this.color = DEF_COLOR;
        this.age = inAge;
        this.weight = DEF_WEIGHT;
    }

    public Cat(int inWeight, String inColor){
        this.name = null;
        this.address = null;
        this.color = inColor;
        this.age = DEF_AGE;
        this.weight = inWeight;
    }

    public Cat(int inWeight, String inColor, String inAddress){
        this.name = null;
        this.address = inAddress;
        this.color = inColor;
        this.age = DEF_AGE;
        this.weight = inWeight;
    }

    public static void main(String[] args) {

    }
}
