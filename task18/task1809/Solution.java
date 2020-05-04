package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(cmdReader.readLine());
        FileOutputStream outputStream = new FileOutputStream(cmdReader.readLine());

        if (inputStream.available() > 0) {
            byte[] allBytes = new byte[inputStream.available()];
            inputStream.read(allBytes);
            for (int i = allBytes.length - 1; i >= 0; i--) outputStream.write(allBytes[i]);
        }

        cmdReader.close();
        inputStream.close();
        outputStream.close();
    }
}
