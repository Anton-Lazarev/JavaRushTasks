package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(cmdReader.readLine());
        FileOutputStream firstOutput = new FileOutputStream(cmdReader.readLine());
        FileOutputStream secondOutput = new FileOutputStream(cmdReader.readLine());

        if ((inputStream.available() % 2) == 0) {
            byte[] half = new byte[inputStream.available() / 2];
            inputStream.read(half);
            firstOutput.write(half);
            while (inputStream.available() > 0) secondOutput.write(inputStream.read());
        } else {
            byte[] half = new byte[(inputStream.available() / 2) + 1];
            inputStream.read(half);
            firstOutput.write(half);
            while (inputStream.available() > 0) secondOutput.write(inputStream.read());
        }

        cmdReader.close();
        inputStream.close();
        firstOutput.close();
        secondOutput.close();
    }
}
