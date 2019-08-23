package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] nums = new int[10];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) strings[i] = input.readLine();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = strings[i].length();
            System.out.println(nums[i]);
        }
    }
}
