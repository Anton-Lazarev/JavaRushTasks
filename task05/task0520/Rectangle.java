package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top, left, width, height;

    public Rectangle(int inTop, int inLeft, int inWidth, int inHeight){
        this.top = inTop;
        this.left = inLeft;
        this.width = inWidth;
        this.height = inHeight;
    }

    public Rectangle(int inWidth, int inHeight){
        this.top = 0;
        this.left = 0;
        this.width = inWidth;
        this.height = inHeight;
    }

    public Rectangle(int inTop, int inLeft, int inWidth){
        this.top = inTop;
        this.left = inLeft;
        this.width = inWidth;
        this.height = inWidth;
    }

    public Rectangle(int inWidth){
        this.top = 0;
        this.left = 0;
        this.width = inWidth;
        this.height = inWidth;
    }

    public Rectangle(){
        this.top = 0;
        this.left = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(Rectangle anotherRectangle){
        this.top = anotherRectangle.top;
        this.left = anotherRectangle.left;
        this.width = anotherRectangle.width;
        this.height = anotherRectangle.height;
    }

    public static void main(String[] args) {

    }
}
