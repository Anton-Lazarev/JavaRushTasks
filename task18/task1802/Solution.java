package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInput = new FileInputStream(cmdReader.readLine());
        int min = 65535;
        while (fileInput.available() > 0) {
            int tmp = fileInput.read();
            if (tmp < min) min = tmp;
        }
        System.out.println(min);
        cmdReader.close();
        fileInput.close();
    }
}
