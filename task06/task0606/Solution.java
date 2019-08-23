package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));
        String num = cmdInput.readLine();

        for (int i = 0; i <= num.length() - 1; i++){
            int tempInt = Character.getNumericValue(num.charAt(i));
            if (tempInt % 2 == 0){
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
