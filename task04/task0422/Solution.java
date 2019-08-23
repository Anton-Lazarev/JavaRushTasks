package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));
        String name = cmdInput.readLine();
        String inAge = cmdInput.readLine();
        int age = Integer.parseInt(inAge);

        if (age < 18) System.out.println("Подрасти еще");
    }
}
