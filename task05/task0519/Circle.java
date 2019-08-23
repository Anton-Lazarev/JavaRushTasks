package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
*/


public class Circle {
    private int centerX, centerY, radius, width, color;

    public Circle(int inCenterX, int inCenterY, int inRadius){
        this.centerX = inCenterX;
        this.centerY = inCenterY;
        this.radius = inRadius;
    }

    public Circle(int inCenterX, int inCenterY, int inRadius, int inWidth){
        this.centerX = inCenterX;
        this.centerY = inCenterY;
        this.radius = inRadius;
        this.width = inWidth;
    }

    public Circle(int inCenterX, int inCenterY, int inRadius, int inWidth, int inColor){
        this.centerX = inCenterX;
        this.centerY = inCenterY;
        this.radius = inRadius;
        this.width = inWidth;
        this.color = inColor;
    }

    public static void main(String[] args) {

    }
}
