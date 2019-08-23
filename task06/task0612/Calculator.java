package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        double dA = a, dB = b;
        return dA / dB;
    }

    public static double percent(int a, int b) {
        double result = a * b / 100.0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(division(5, 2));
        System.out.println(percent(35, 13));
    }
}