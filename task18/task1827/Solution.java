package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length != 0 && args[0].equals("-c")) {
            BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = cmdReader.readLine();
            FileOutputStream fileOutput = new FileOutputStream(fileName, true);
            FileInputStream fileInput = new FileInputStream(fileName);
            BufferedReader lineInFile = new BufferedReader(new InputStreamReader(fileInput));

            //Find max id in file
            int maxIDinFile = 0;
            String item = null;
            while ((item = lineInFile.readLine()) != null) {
                String fullID = item.substring(0, 8);
                int IDFromLine;
                if (fullID.contains(" ")) IDFromLine = Integer.parseInt(fullID.substring(0, fullID.indexOf(" ")));
                else IDFromLine = Integer.parseInt(fullID);

                if (maxIDinFile <= IDFromLine) maxIDinFile = IDFromLine;
            }

            //Let's add new item to file
            String newItem = "";

            maxIDinFile++;
            String strIDtoFile = Integer.toString(maxIDinFile);
            int diff = 8 - strIDtoFile.length();
            if (strIDtoFile.length() < 8) for (int i = 0; i < diff; i++) strIDtoFile += " ";

            String productNameToFile = args[1];
            diff = 30 - productNameToFile.length();
            if (productNameToFile.length() < 30) for (int i = 0; i < diff; i++) productNameToFile += " ";

            String priceToFile = args[2];
            diff = 8 - priceToFile.length();
            if (priceToFile.length() < 8) for (int i = 0; i < diff; i++) priceToFile += " ";

            String quantityToFile = args[3];
            diff = 4 - quantityToFile.length();
            if (quantityToFile.length() < 4) for (int i = 0; i < diff; i++) quantityToFile += " ";

            newItem = strIDtoFile + productNameToFile + priceToFile + quantityToFile;

            byte[] bytesOfNewItem = newItem.getBytes();
            fileOutput.write('\n');
            fileOutput.write(bytesOfNewItem);

            cmdReader.close();
            lineInFile.close();
            fileInput.close();
            fileOutput.close();
        }
    }
}
