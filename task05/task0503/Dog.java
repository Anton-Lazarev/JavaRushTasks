package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    private String name;
    private int age;

    public void setName(String inName){
        this.name = inName;
    }

    public void setAge(int inAge){
        this.age = inAge;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

    }
}
