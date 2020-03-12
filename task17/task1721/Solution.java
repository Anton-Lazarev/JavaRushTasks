package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader firstFileReader = new BufferedReader(new FileReader(cmdReader.readLine()));
            BufferedReader secondFileReader = new BufferedReader(new FileReader(cmdReader.readLine()));
            String tmp;

            tmp = firstFileReader.readLine();
            while (tmp != null) {
                allLines.add(tmp);
                tmp = firstFileReader.readLine();
            }

            tmp = secondFileReader.readLine();
            while (tmp != null) {
                forRemoveLines.add(tmp);
                tmp = secondFileReader.readLine();
            }

             new Solution().joinData();

            cmdReader.close();
            firstFileReader.close();
            secondFileReader.close();
        } catch (CorruptedDataException e) {
        } catch (IOException e) { }


    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else  {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
