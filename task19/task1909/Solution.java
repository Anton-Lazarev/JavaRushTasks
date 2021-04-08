package com.javarush.task.task19.task1909;

/* 
Замена знаков
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл содержимое первого файла, где заменены все точки "." на знак "!" (Для записи в файл используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fromFile = new FileReader(cmdReader.readLine());
        BufferedReader fileReader = new BufferedReader(fromFile);

        FileWriter toFile = new FileWriter(cmdReader.readLine());
        BufferedWriter fileWriter = new BufferedWriter(toFile);

        String lineFromFile;

        while ((lineFromFile = fileReader.readLine())!=null) {
            fileWriter.write(lineFromFile.replace(".", "!"));
        }

        cmdReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
