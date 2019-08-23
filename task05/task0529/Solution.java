package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int summ = 0;
        boolean flag = false;
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));

        while (flag != true) {
            String inNum = cmdInput.readLine();
            if (inNum.equals("сумма")){
                flag = true;
                System.out.println(summ);
            } else {
                int num = Integer.parseInt(inNum);
                summ = summ + num;
            }
        }
    }
}
