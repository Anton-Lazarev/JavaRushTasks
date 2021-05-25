package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedFileReader = new BufferedReader(fileReader);

        TreeMap<String, Double> salaryMap = new TreeMap<>();
        String lineFromFile = "";

        while ((lineFromFile = bufferedFileReader.readLine()) != null) {
            String name = lineFromFile.substring(0, lineFromFile.indexOf(" "));
            Double salary = Double.parseDouble(lineFromFile.substring(lineFromFile.indexOf(" ")));

            if (!(salaryMap.containsKey(name))) {
                salaryMap.put(name, salary);
            } else {
                Double summarySalary = salaryMap.get(name) + salary;
                salaryMap.replace(name, summarySalary);
            }
        }

        fileReader.close();
        bufferedFileReader.close();

        Double maxSummarySalary = 0.0;
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            Double value = entry.getValue();
            if (maxSummarySalary <= value) maxSummarySalary = value;
        }

        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            if (entry.getValue().equals(maxSummarySalary)) System.out.println(entry.getKey());
        }
    }
}
