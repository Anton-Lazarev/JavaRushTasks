package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileReader firstFile = new FileReader(args[0]);
        BufferedReader firstFileReader = new BufferedReader(firstFile);
        FileWriter secondFile = new FileWriter(args[1]);
        ArrayList<String> hugeWords = new ArrayList<>();
        String lineFromFile = "";

        while ((lineFromFile = firstFileReader.readLine()) != null) {
            String[] wordsFromLine = lineFromFile.split(" ");

            for (String word : wordsFromLine) if (word.length() > 6) hugeWords.add(word);
        }

        for (int i = 0; i < hugeWords.size() - 1; i++) secondFile.write(hugeWords.get(i) + ",");
        secondFile.write(hugeWords.get(hugeWords.size() - 1));

        firstFile.close();
        secondFile.close();
        firstFileReader.close();
    }
}
