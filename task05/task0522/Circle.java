package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(){
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(double inX, double inY, double inRadius){
        this.x = inX;
        this.y = inY;
        this.radius = inRadius;
    }

    public Circle(double inX, double inY){
        this.x = inX;
        this.y = inY;
        this.radius = 0;
    }

    public Circle(double inRadius){
        this.x = 0;
        this.y = 0;
        this.radius = inRadius;
    }

    public static void main(String[] args) {

    }
}