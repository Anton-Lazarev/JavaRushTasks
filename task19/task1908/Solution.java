package com.javarush.task.task19.task1908;

/* 
Выделяем числа
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fromFile = new FileReader(cmdReader.readLine());
        BufferedReader fileReader = new BufferedReader(fromFile);

        FileWriter toFile = new FileWriter(cmdReader.readLine());
        BufferedWriter fileWriter = new BufferedWriter(toFile);

        String lineFromFile;

        while ((lineFromFile = fileReader.readLine()) != null) {
            Pattern spacePattern = Pattern.compile("\\s");
            Pattern digits = Pattern.compile("\\d+");
            String[] splittedLine = spacePattern.split(lineFromFile);
            for (String s: splittedLine) {
                Matcher matcher = digits.matcher(s);
                if (matcher.matches()) {
                    fileWriter.write(s + " ");
                }
            }
        }

        cmdReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
