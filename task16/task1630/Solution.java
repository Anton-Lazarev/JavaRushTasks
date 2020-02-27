package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {}
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread  extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String fileContent = "";

        @Override
        public void setFileName(String fullFileName) { this.fullFileName = fullFileName; }

        @Override
        public String getFileContent() { return this.fileContent; }

        @Override
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName)));
                String tmp = fileReader.readLine();
                while(tmp != null) {
                    fileContent = fileContent + tmp + " ";
                    tmp = fileReader.readLine();
                }
            } catch (IOException e) { }
        }
    }


}
