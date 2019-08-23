package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    private int centerX, centerY, radius, width, color;

    public void initialize(int inCenterX, int inCenterY, int inRadius){
        this.centerX = inCenterX;
        this.centerY = inCenterY;
        this.radius = inRadius;
    }

    public void initialize(int inCenterX, int inCenterY, int inRadius, int inWidth){
        this.centerX = inCenterX;
        this.centerY = inCenterY;
        this.radius = inRadius;
        this.width = inWidth;
    }

    public void initialize(int inCenterX, int inCenterY, int inRadius, int inWidth, int inColor){
        this.centerX = inCenterX;
        this.centerY = inCenterY;
        this.radius = inRadius;
        this.width = inWidth;
        this.color = inColor;
    }

    public static void main(String[] args) {

    }
}
