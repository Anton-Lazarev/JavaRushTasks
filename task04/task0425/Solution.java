package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));
        String inA = cmdInput.readLine();
        String inB = cmdInput.readLine();

        int a = Integer.parseInt(inA);
        int b = Integer.parseInt(inB);

        if (a > 0)
            {
                if (b > 0) System.out.println(1);
                else System.out.println(4);
            }
        else
        {
            if (b > 0) System.out.println(2);
            else System.out.println(3);
        }
    }
}
