package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[20];
        int[] first = new int[10];
        int[] second = new int[10];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(input.readLine());
        for (int i = 0; i < nums.length / 2; i++){
            first[i] = nums[i];
            second[i] = nums[nums.length / 2 + i];
            System.out.println(second[i]);
        }
    }
}
