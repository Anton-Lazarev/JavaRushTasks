package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream(args[0]);
        double all = 0;
        double spaces = 0;
        while (inputStream.available() > 0) {
            if (inputStream.read() == ' ') {
                spaces++;
                all++;
            } else all++;
        }
        inputStream.close();
        double result = (spaces/all) * 100.0;
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println(df.format(result));
    }
}
