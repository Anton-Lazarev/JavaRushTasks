package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max = 1;
        int tempMax = 1;

        for (int i = 0; i < 10; i++)
            list.add(Integer.parseInt(reader.readLine()));

        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                tempMax = tempMax + 1;
                if (tempMax > max)
                    max = tempMax;
            } else tempMax = 1;
        }

        System.out.println(max);
    }
}