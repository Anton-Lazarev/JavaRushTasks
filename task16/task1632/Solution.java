package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new InfiniteThread());
        threads.add(new InterruptThread());
        threads.add(new RunThread());
        threads.add(new MessageThread());
        threads.add(new SummaryThread());
    }

    public static void main(String[] args) {
    }

    public static class InfiniteThread extends Thread {
        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class InterruptThread extends Thread {
        @Override
        public void interrupt() {
            System.out.println("InterruptedException");
            super.interrupt();
        }
    }

    public static class RunThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        }
    }

    public static class MessageThread extends Thread implements Message {

        private boolean stop = false;
        @Override
        public void run() {
            while (!stop) {}
        }

        @Override
        public void showWarning() {
            stop = true;
            this.interrupt();
        }
    }

    public static class SummaryThread extends Thread {
        int summary;

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String tmp = reader.readLine();
                while (!tmp.equals("N")) {
                    summary = summary + Integer.parseInt(tmp);
                    tmp = reader.readLine();
                }
                reader.close();
                System.out.println(summary);
            } catch (IOException e) {}
        }
    }
}