package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileStream = new FileInputStream(cmdReader.readLine());
        int max = 0;
        while (fileStream.available() > 0) {
            int tmp = fileStream.read();
            if (tmp > max) max = tmp;
        }
        System.out.println(max);
        cmdReader.close();
        fileStream.close();
    }
}
