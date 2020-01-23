package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        while (!flag) {
            String rode = cmdReader.readLine();
            if (rode.equals("exit")) flag = true;
            else if (rode.contains(".")) {
                try { print(Double.parseDouble(rode)); }
                catch (Exception e) { print(rode); }
            }
            else try {
                if (Integer.parseInt(rode) > 0 && Integer.parseInt(rode) < 128 ) print(Short.parseShort(rode));
                else if (Integer.parseInt(rode) <=0 || Integer.parseInt(rode) >= 128) print(Integer.parseInt(rode));
                else print(rode);
                } catch (Exception e) { print(rode); }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
