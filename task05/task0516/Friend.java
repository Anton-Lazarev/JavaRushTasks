package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public Friend(String inName){
        this.name = inName;
    }

    public Friend(String inName, int inAge){
        this.name = inName;
        this.age = inAge;
    }

    public Friend(String inName, int inAge, char inSex){
        this.name = inName;
        this.age = inAge;
        this.sex = inSex;
    }

    public static void main(String[] args) {

    }
}
