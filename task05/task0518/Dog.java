package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    private  String name, color;
    private int height;

    public Dog(String inName){
        this.name = inName;
    }

    public Dog(String inName, int inHeight){
        this.name = inName;
        this.height = inHeight;
    }

    public Dog(String inName, int inHeight, String inColor){
        this.name = inName;
        this.height = inHeight;
        this.color = inColor;
    }

    public static void main(String[] args) {

    }
}
