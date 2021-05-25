package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(cmdReader.readLine());
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);

        String lineFromFile = "";
        while ((lineFromFile = bufferedFileReader.readLine()) != null)
            System.out.println(new StringBuilder(lineFromFile).reverse());

        cmdReader.close();
        bufferedFileReader.close();
        fileReader.close();
    }
}
