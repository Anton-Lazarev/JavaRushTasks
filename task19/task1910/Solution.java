package com.javarush.task.task19.task1910;

/* 
Пунктуация
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fromFile = new FileReader(cmdReader.readLine());
        BufferedReader fileReader = new BufferedReader(fromFile);
        FileWriter toFile = new FileWriter(cmdReader.readLine());
        BufferedWriter fileWriter = new BufferedWriter(toFile);
        String lineFromFile;

        while ((lineFromFile = fileReader.readLine())!=null) {
            Pattern punct = Pattern.compile("\\p{Punct}");
            String[] splitted = punct.split(lineFromFile);
            for (String s: splitted) fileWriter.write(s);
        }

        cmdReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
