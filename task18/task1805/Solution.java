package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileStream = new FileInputStream(cmdReader.readLine());
        ArrayList<Integer> bytes = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();

        while (fileStream.available() > 0) {
            bytes.add(fileStream.read());
        }
        cmdReader.close();
        fileStream.close();

        ints.add(bytes.get(0));

        for (int i = 1; i < bytes.size(); i++) {
            if (!ints.contains(bytes.get(i))) {
                ints.add(bytes.get(i));
            }
        }

        Collections.sort(ints);

        for (int i = 0; i < ints.size(); i++) {
            System.out.print(ints.get(i) + " ");
        }
    }
}
