package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException{
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader oldFile = new FileReader(cmdReader.readLine());
        FileReader newFile = new FileReader(cmdReader.readLine());

        BufferedReader oldFileReader = new BufferedReader(oldFile);
        BufferedReader newFileReader = new BufferedReader(newFile);

        List<String> oldFileLines = new ArrayList<>();
        List<String> newFileLines = new ArrayList<>();
        String lineFromFile = "";

        while ((lineFromFile = oldFileReader.readLine()) != null) oldFileLines.add(lineFromFile);
        while ((lineFromFile = newFileReader.readLine()) != null) newFileLines.add(lineFromFile);


        for (int i = 0; i < newFileLines.size() - 2; i++) {
            if (newFileLines.get(i).equals(oldFileLines.get(i))) lines.add(new LineItem(Type.SAME, newFileLines.get(i)));
            else {
                if (!(newFileLines.get(i).equals(oldFileLines.get(i+1))))
                    lines.add(new LineItem(Type.ADDED, newFileLines.get(i)));
                else {
                    lines.add(new LineItem(Type.REMOVED, oldFileLines.get(i)));
                    lines.add(new LineItem(Type.SAME, newFileLines.get(i)));
                }
            }
        }

        if (newFileLines.size() > oldFileLines.size()) {
            if (newFileLines.get(newFileLines.size() - 1).equals(oldFileLines.get(oldFileLines.size() - 1))) {
                lines.add(new LineItem(Type.ADDED, newFileLines.get(newFileLines.size() - 2)));
                lines.add(new LineItem(Type.SAME, newFileLines.get(newFileLines.size() - 1)));
            } else {
                lines.add(new LineItem(Type.SAME, newFileLines.get(newFileLines.size() - 2)));
                lines.add(new LineItem(Type.ADDED, newFileLines.get(newFileLines.size() - 1)));
            }
        } else if (newFileLines.size() < oldFileLines.size()) {

        } else {

        }

        cmdReader.close();
        oldFile.close();
        oldFileReader.close();
        newFile.close();
        newFileReader.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
