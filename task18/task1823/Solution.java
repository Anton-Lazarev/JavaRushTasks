package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = cmdReader.readLine()).equals("exit")) {
            ReadThread readThread = new ReadThread(input);
            readThread.start();
        }
        cmdReader.close();
    }

    public static class ReadThread extends Thread {
        private String filePath;
        public ReadThread(String fileName) {
            this.filePath = fileName;
    }

        @Override
        public void run() {
            try {
                int[] byteCounts = new int[256];
                FileInputStream inputStream = new FileInputStream(filePath);

                while (inputStream.available() > 0) {
                    int tmp = inputStream.read();
                    byteCounts[tmp]++;
                }

                int maxCount = 0;
                for (int i = 0; i < byteCounts.length; i ++) if (byteCounts[i] > maxCount) maxCount = byteCounts[i];

                for (int i = 0; i < byteCounts.length; i ++) if (maxCount == byteCounts[i]) resultMap.put(filePath, i);

                inputStream.close();
            } catch (Exception e) { }
        }
    }
}
