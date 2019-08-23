package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    private static int catCount = 0;

    public Cat(){
        Cat.catCount = Cat.catCount + 1;
    }

    public static void main(String[] args) {

    }
}
