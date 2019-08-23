package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>(4);

        for (int i = 0; i < 5; i++)
        {
            int inNum = Integer.parseInt(reader.readLine());
            nums.add(inNum);
        }

        Collections.sort(nums);

       /* boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                    flag = true;
                }
            }
        }*/

        for (int i = 0; i < nums.size(); i++) System.out.println(nums.get(i));
    }
}
