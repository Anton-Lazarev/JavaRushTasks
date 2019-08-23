package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;
        int count = Integer.parseInt(reader.readLine());

        for (int i = count; i > 0; i--){
            int num = Integer.parseInt(reader.readLine());
            if (num >= maximum) maximum = num;
        }

        System.out.println(maximum);
    }
}
