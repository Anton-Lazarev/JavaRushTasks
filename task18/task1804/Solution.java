package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileStream = new FileInputStream(cmdReader.readLine());
        ArrayList<Integer> bytes = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        int minCount;

        while (fileStream.available() > 0) {
            bytes.add(fileStream.read());
        }
        cmdReader.close();
        fileStream.close();

        ints.add(bytes.get(0));
        counts.add(1);

        for (int i = 1; i < bytes.size(); i++) {
            if (ints.contains(bytes.get(i))) {
                int tmp = counts.get(ints.indexOf(bytes.get(i)));
                counts.set(ints.indexOf(bytes.get(i)), tmp + 1);
            } else {
                ints.add(bytes.get(i));
                counts.add(1);
            }
        }

        minCount = counts.get(0);
        for (int i = 1; i < counts.size(); i++) {
            if(counts.get(i) < minCount) minCount = counts.get(i);
        }

        for (int i = 0; i < ints.size(); i++) {
            if (counts.get(i) == minCount) System.out.print(ints.get(i) + " ");
        }
    }
}
