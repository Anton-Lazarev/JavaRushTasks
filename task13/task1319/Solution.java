package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            String lineInFile;
            boolean flag = false;
            while (!flag){
                lineInFile = reader.readLine();
                if (!lineInFile.equals("exit")){
                    flag = false;
                    writer.write(lineInFile + "\n");
                } else {
                    flag = true;
                    writer.write(lineInFile + "\n");
                }
            }

            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
