package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int[] countsASCII = new int[256];

        while (inputStream.available() > 0) {
            int byteFromFile = inputStream.read();
            countsASCII[byteFromFile]++;
        }

        inputStream.close();

        for (int i = 0; i < countsASCII.length; i++) {
            if (countsASCII[i] != 0) System.out.println((char) i + " " + countsASCII[i]);
        }
    }
}
