package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(cmdReader.readLine());
        BufferedReader lineFileReader = new BufferedReader(new InputStreamReader(inputStream));

        String lineFromFile = null;
        while ((lineFromFile = lineFileReader.readLine()) != null) {
                if (lineFromFile.startsWith(args[0] + " ")) {
                System.out.println(lineFromFile);
                break;
            }
        }

        /* First time
        while (inputStream.available() > 0) {
            String tmpStr = "";
            char ch = (char) inputStream.read();
            while (ch!= '\n') {
                tmpStr += ch;
                if (inputStream.available() != 0)
                ch = (char) inputStream.read();
                else break;
            }
            String strID = tmpStr.substring(0, tmpStr.indexOf(" "));
            if (Integer.parseInt(strID) != Integer.parseInt(args[0])) tmpStr = "";
            else {
                System.out.println(tmpStr.substring(tmpStr.indexOf(" ") + 1));
                break;
            }
        }
         */

        cmdReader.close();
        inputStream.close();
        lineFileReader.close();
    }
}
