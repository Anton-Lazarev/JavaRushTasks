package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = cmdReader.readLine();
        String secondFile = cmdReader.readLine();

        FileInputStream firstFileInput = new FileInputStream(firstFile);
        FileInputStream secondFileInput = new FileInputStream(secondFile);

        byte[] firstFileBites = new byte[firstFileInput.available()];
        byte[] secondFileBytes = new byte[secondFileInput.available()];
        byte[] allBytes = new byte[secondFileBytes.length + firstFileBites.length];

        firstFileInput.read(firstFileBites);
        secondFileInput.read(secondFileBytes);

        for (int i = 0; i < secondFileBytes.length; i++) allBytes[i] = secondFileBytes[i];
        for (int i = 0; i < firstFileBites.length; i++) allBytes[i + secondFileBytes.length] = firstFileBites[i];

        FileOutputStream outputStream = new FileOutputStream(firstFile);

        outputStream.write(allBytes);

        cmdReader.close();
        firstFileInput.close();
        secondFileInput.close();
        outputStream.close();
    }
}
