package com.javarush.task.task19.task1923;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileReader inputFile = new FileReader(args[0]);
        BufferedReader fileInputReader = new BufferedReader(inputFile);
        FileWriter secondFile = new FileWriter(args[1]);

        String lineFromFile = "";
        while ((lineFromFile = fileInputReader.readLine()) != null) {
            String[] wordsFromLine = lineFromFile.split(" ");

            //if (word.matches(".+\\d+.*")) - previous version "if" statement
            for (String word : wordsFromLine) {
                if (new Solution().haveDigitInLine(word)) secondFile.write(word + " ");
            }
        }
        inputFile.close();
        fileInputReader.close();
        secondFile.close();
    }

    public boolean haveDigitInLine(String line) {
        char[] charsFromLine = line.toCharArray();
        for (char ch : charsFromLine) {
            if (Character.isDigit(ch)) return true;
        }
        return false;
    }
}
