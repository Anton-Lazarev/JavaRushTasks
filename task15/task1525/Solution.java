package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String tmp = fileReader.readLine();
            while (tmp!=null) {
                lines.add(tmp);
                tmp = fileReader.readLine();
            }
        } catch (FileNotFoundException e) { System.out.println(e.getMessage());
        } catch (IOException e) { System.out.println(e.getMessage());}
        }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
