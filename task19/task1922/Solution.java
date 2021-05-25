package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(cmdReader.readLine());
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);

        String lineFromFile = "";
        while ((lineFromFile = bufferedFileReader.readLine()) != null) {
            String[] wordsFromLine = lineFromFile.split(" ");
            int count = 0;

            for (int i = 0; i < wordsFromLine.length; i++) {
                if (words.contains(wordsFromLine[i])) count++;
            }

            if (count == 2) System.out.println(lineFromFile);
        }

        cmdReader.close();
        fileReader.close();
        bufferedFileReader.close();
    }
}
