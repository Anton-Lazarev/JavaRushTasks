package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length != 0) {
            BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = cmdReader.readLine();
            FileInputStream fileInput = new FileInputStream(fileName);
            BufferedReader fileLineReader = new BufferedReader(new InputStreamReader(fileInput));

            ArrayList<String> bufferOfStringsFromFile = new ArrayList<>();
            String lineFromFile;
            while ((lineFromFile = fileLineReader.readLine()) != null) bufferOfStringsFromFile.add(lineFromFile);

            cmdReader.close();
            fileLineReader.close();
            fileInput.close();

            switch (args[0]) {
                case "-u":
                    for (int i = 0; i < bufferOfStringsFromFile.size(); i++) {
                        String fullIDFromItem = bufferOfStringsFromFile.get(i).substring(0, 7);
                        String intsInID;
                        if (fullIDFromItem.contains(" "))
                            intsInID = fullIDFromItem.substring(0, fullIDFromItem.indexOf(" "));
                        else intsInID = fullIDFromItem;
                        if (intsInID.equals(args[1])) {
                            String newItem;

                            String strIDtoFile = args[1];
                            int diff = 8 - strIDtoFile.length();
                            if (strIDtoFile.length() < 8) for (int j = 0; j < diff; j++) strIDtoFile += " ";

                            String productNameToFile = args[2];
                            diff = 30 - productNameToFile.length();
                            if (productNameToFile.length() < 30)
                                for (int j = 0; j < diff; j++) productNameToFile += " ";

                            String priceToFile = args[3];
                            diff = 8 - priceToFile.length();
                            if (priceToFile.length() < 8) for (int j = 0; j < diff; j++) priceToFile += " ";

                            String quantityToFile = args[4];
                            diff = 4 - quantityToFile.length();
                            if (quantityToFile.length() < 4) for (int j = 0; j < diff; j++) quantityToFile += " ";

                            newItem = strIDtoFile + productNameToFile + priceToFile + quantityToFile;
                            bufferOfStringsFromFile.set(i, newItem);
                        }
                    }

                    FileOutputStream fileOutputForUpdate = new FileOutputStream(fileName);
                    for (int i = 0; i < bufferOfStringsFromFile.size(); i++) {
                        if (i < bufferOfStringsFromFile.size() - 1) {
                            fileOutputForUpdate.write(bufferOfStringsFromFile.get(i).getBytes());
                            fileOutputForUpdate.write('\n');
                        } else fileOutputForUpdate.write(bufferOfStringsFromFile.get(i).getBytes());
                    }
                    fileOutputForUpdate.close();
                    break;
                case "-d":
                    for (int i = 0; i < bufferOfStringsFromFile.size(); i++) {
                        String fullIDFromItem = bufferOfStringsFromFile.get(i).substring(0, 7);
                        String intsInID;
                        if (fullIDFromItem.contains(" "))
                            intsInID = fullIDFromItem.substring(0, fullIDFromItem.indexOf(" "));
                        else intsInID = fullIDFromItem;
                        if (intsInID.equals(args[1])) bufferOfStringsFromFile.remove(i);
                    }

                    FileOutputStream fileOutputForDelete = new FileOutputStream(fileName);
                    for (int i = 0; i < bufferOfStringsFromFile.size(); i++) {
                        if (i < bufferOfStringsFromFile.size() - 1) {
                            fileOutputForDelete.write(bufferOfStringsFromFile.get(i).getBytes());
                            fileOutputForDelete.write('\n');
                        } else fileOutputForDelete.write(bufferOfStringsFromFile.get(i).getBytes());
                    }
                    fileOutputForDelete.close();
                    break;
                default:
                    break;
            }
        }
    }
}
