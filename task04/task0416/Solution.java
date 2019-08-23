package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));
        String inMinutes = cmdInput.readLine();
        double minutes = Double.parseDouble(inMinutes);

        if ((minutes % 5 >= 3) &&(minutes % 5 < 4)) System.out.println("жёлтый");
        else if ((minutes % 5 >= 4)) System.out.println("красный");
        else System.out.println("зелёный");
    }
}