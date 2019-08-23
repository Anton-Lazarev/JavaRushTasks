package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        double coefCat = 1, coefAnotherCat = 1;

        if (this.age <= anotherCat.age)
            coefCat = coefCat * 1.5;
        else
            coefAnotherCat = coefAnotherCat * 1.5;

        if (this.weight <= anotherCat.weight)
            coefCat = coefCat * 1.2;
        else
            coefAnotherCat = coefAnotherCat * 1.2;

        if (this.strength >= anotherCat.strength)
            coefCat = coefCat * 2;
        else
            coefAnotherCat = coefAnotherCat * 2;

        if (coefCat >= coefAnotherCat)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    }
}
