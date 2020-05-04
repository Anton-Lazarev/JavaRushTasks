package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream output = new FileOutputStream(cmdReader.readLine());
        FileInputStream firstInput = new FileInputStream(cmdReader.readLine());
        FileInputStream secondInput = new FileInputStream(cmdReader.readLine());

        while (firstInput.available() > 0) output.write(firstInput.read());
        while (secondInput.available() > 0) output.write(secondInput.read());

        cmdReader.close();
        output.close();
        firstInput.close();
        secondInput.close();
    }
}
