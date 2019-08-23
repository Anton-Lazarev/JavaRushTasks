package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        double summ = 0;
        boolean flag = false;
        while (flag != true) {
            String inNum = cmdInput.readLine();
            int num = Integer.parseInt(inNum);

            if (num == -1) {
                flag = true;
                double result = summ / count;
                System.out.println(result);
            } else {
                count = count + 1;
                summ = summ + num;
            }
        }
    }
}

