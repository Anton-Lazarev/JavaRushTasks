package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));
        String inYear = cmdInput.readLine();
        int year = Integer.parseInt(inYear);

        if (year % 4 == 0)
            if ((year % 100 == 0) && (year % 400 != 0))System.out.println("количество дней в году: 365");
            else System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
    }
}