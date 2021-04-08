package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(cmdReader.readLine());
        BufferedReader fileLineReader = new BufferedReader(reader);

        String line;
        int worldCount = 0;
        while ((line = fileLineReader.readLine()) != null) {
            //allTextInFile.replaceAll("\r\n", ".");
            Pattern punctuation = Pattern.compile("[\\s\\p{Punct}]");
            String[] splitted = punctuation.split(line);
            for (int i = 0; i < splitted.length; i++) {
                if (splitted[i].equals("world")) worldCount++;
            }
        }
        cmdReader.close();
        reader.close();
        System.out.println(worldCount);
    }
}
