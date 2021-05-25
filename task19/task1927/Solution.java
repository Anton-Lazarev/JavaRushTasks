package com.javarush.task.task19.task1927;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception {
        PrintStream defaultConsoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(outputStream);
        System.setOut(newStream);

        testString.printSomething();
        String result = outputStream.toString();
        String[] linesFromResult = result.split(System.lineSeparator());
        int count = 0;

        System.setOut(defaultConsoleStream);
        outputStream.close();

        for (String line : linesFromResult) {
            if (count != 2) count++;
            else {
                count = 1;
                System.out.println("JavaRush - курсы Java онлайн");
            }
            System.out.println(line);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
