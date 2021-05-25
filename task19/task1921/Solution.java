package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);
        String lineFromFile = "";

        while ((lineFromFile = bufferedFileReader.readLine()) != null) {
            String[] wordsFromFile = lineFromFile.split(" ");
            String name = "";
            for (int i = 0; i < wordsFromFile.length - 3; i++) name = name + wordsFromFile[i] + " ";

            int yearFromLine = Integer.parseInt(wordsFromFile[wordsFromFile.length - 1]);
            int monthFromLine = Integer.parseInt(wordsFromFile[wordsFromFile.length - 2]);
            int dateFromLine = Integer.parseInt(wordsFromFile[wordsFromFile.length - 3]);

            Calendar birth = new GregorianCalendar(yearFromLine, monthFromLine - 1, dateFromLine);

            PEOPLE.add(new Person(name.trim(), birth.getTime()));
        }
        fileReader.close();
        bufferedFileReader.close();
    }
}
