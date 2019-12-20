package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        try {
            FileInputStream stream = new FileInputStream(fileName);
            while (stream.available() > 0) {
                char tmp = (char)stream.read();
                System.out.print(tmp);
            }
            stream.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUNDED");
        }
    }
}