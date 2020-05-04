package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(cmdReader.readLine());
        FileOutputStream outputStream = new FileOutputStream(cmdReader.readLine());

        String tmp = "";

        while (inputStream.available() > 0) {
            char sym = (char) inputStream.read();
            if (sym != ' ') tmp = tmp + sym;
            else {
                double doub = Double.parseDouble(tmp);
                int rounded = (int) Math.round(doub);
                String result = rounded + " ";
                outputStream.write(result.getBytes());
                tmp = "";
            }
        }

        double lastDoub = Double.parseDouble(tmp);
        int lastRounded = (int) Math.round(lastDoub);
        String lastResult = lastRounded + " ";
        outputStream.write(lastResult.getBytes());

        cmdReader.close();
        inputStream.close();
        outputStream.close();
    }
}
