package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputFile = new FileInputStream(reader.readLine());
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputFile));
            String number = "";
            ArrayList<Integer> list = new ArrayList<>();
            while ((number = fileReader.readLine())!=null){
                int tmp = Integer.parseInt(number);
                if (tmp%2==0) list.add(tmp);
                number = "";
            }
            Collections.sort(list);
            for (Integer item : list) System.out.println(item);
            fileReader.close();
            reader.close();
            inputFile.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
