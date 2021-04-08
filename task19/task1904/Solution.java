package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner toFS) {
            this.fileScanner = toFS;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

        @Override
        public Person read() throws IOException {
            String lineWithPerson = "";
            if (fileScanner.hasNext())  lineWithPerson = fileScanner.nextLine();
            String[] parsedStr = lineWithPerson.split(" ");

            DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date personBirthday = new Date();
            try {
                personBirthday = dateFormat.parse(parsedStr[3] + " " + parsedStr[4] + " " + parsedStr[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Person person = new Person(parsedStr[1], parsedStr[2], parsedStr[0], personBirthday);
            return person;
        }
    }
}
