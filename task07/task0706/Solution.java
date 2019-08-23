package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] houses = new int[15];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int oddCount = 0, evenCount = 0;

        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(input.readLine());
            if (i == 0) evenCount = evenCount + houses[i];
            else if (i % 2 == 0) evenCount = evenCount + houses[i];
            else if (i % 2 != 0) oddCount = oddCount + houses[i];
        }

        if (oddCount > evenCount) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else if (oddCount < evenCount) System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
