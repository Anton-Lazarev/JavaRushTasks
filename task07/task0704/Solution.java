package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = new int[10];

        for (int i = 0; i < nums.length; i++){
            int temp = Integer.parseInt(cmdInput.readLine());
            nums[i] = temp;
        }

        for (int i = nums.length - 1; i >= 0; i--) System.out.println(nums[i]);
    }
}

