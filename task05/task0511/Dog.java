package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    private int height;
    private String name, color;

    public void initialize(String inName){
        this.name = inName;
    }

    public void initialize(String inName, int inHeight){
        this.name = inName;
        this.height = inHeight;
    }

    public void initialize(String inName, int inHeight, String inColor){
        this.name = inName;
        this.height = inHeight;
        this.color = inColor;
    }

    public static void main(String[] args) {

    }
}
