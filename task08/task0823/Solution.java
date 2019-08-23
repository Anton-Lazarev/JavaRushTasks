package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] as = s.toCharArray();
        String newS = "";

        for (int i = 0; i < as.length; i++){
            String temp = "";
            temp = temp + as[i];
            if (temp.equals(" ")){
                String temp2 = "";
                temp2 = temp2 + as[i + 1];
                temp2 = temp2.toUpperCase();
                newS = newS + as[i];
                newS = newS + temp2;
                i++;
            } else if(i == 0 && !temp.equals(" ")) {
                newS = newS + as[i];
                newS = newS.toUpperCase();
            } else newS = newS + as[i];
        }

        System.out.println(newS);
    }
}
