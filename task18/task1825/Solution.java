package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        String mainFileName = "";
        int maxPart = 0;

        String partFileName = cmdReader.readLine();

        if(partFileName != null) mainFileName = partFileName.substring(0, partFileName.lastIndexOf("."));

        while (!(partFileName.equals("end"))) {
            int parsedNumberOfPart = Integer.parseInt(partFileName.substring(partFileName.lastIndexOf(".")+ 5));
            if (parsedNumberOfPart > maxPart) maxPart = parsedNumberOfPart;
            partFileName = cmdReader.readLine();
        }
        cmdReader.close();

        File fullFile = new File(mainFileName);
        FileOutputStream writeInFullFile = new FileOutputStream(fullFile, true);

        for (int i = 1; i <= maxPart; i++) {
            FileInputStream inputStream = new FileInputStream(mainFileName + ".part" + i);
            byte[] rodeBytes = new byte[inputStream.available()];
            inputStream.read(rodeBytes);
            writeInFullFile.write(rodeBytes);
            inputStream.close();
        }
        writeInFullFile.close();
    }
}
