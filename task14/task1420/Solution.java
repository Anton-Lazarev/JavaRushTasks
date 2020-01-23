package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstInt, secondInt, limit;
        try {
            firstInt = Integer.parseInt(reader.readLine());
            secondInt = Integer.parseInt(reader.readLine());
            if (firstInt <= 0 || secondInt <= 0) throw new Exception();
        } catch (Exception e) {throw e;}

        ArrayList<Integer> ODs = new ArrayList<>();
        limit = Math.max(firstInt, secondInt);

        for (int i = 1; i <= limit; i++){
            if ((firstInt % i==0) && (secondInt % i == 0)) ODs.add(i);
        }

        System.out.println(ODs.get(ODs.size() - 1));

    }
}
