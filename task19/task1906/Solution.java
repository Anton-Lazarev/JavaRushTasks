package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fromFile = new FileReader(cmdReader.readLine());
        FileWriter toFile = new FileWriter(cmdReader.readLine());
        int byteCount = 1;

        while (fromFile.ready()) {
            int symbol = fromFile.read();
            if (byteCount % 2 == 0) {
                toFile.write(symbol);
            }
            byteCount++;
        }

        cmdReader.close();
        fromFile.close();
        toFile.close();
    }
}
