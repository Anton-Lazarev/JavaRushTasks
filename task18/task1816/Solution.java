package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        while (inputStream.available() > 0) {
            if (String.valueOf((char) inputStream.read()).matches("^[A-Za-z]?$")) count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}
