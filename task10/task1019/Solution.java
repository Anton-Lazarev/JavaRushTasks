package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int incorrectInput = 0;
        boolean flag = false;

        for(; ;){
            String strID = reader.readLine();
            if (strID.isEmpty()) break;
            int id = Integer.parseInt(strID);
            String name = reader.readLine();
            if (name.isEmpty()) {
                incorrectInput = id;
                flag = true;
                break;
            }
            map.put(name, id);
        }
        if (!flag)
        {
            for (Map.Entry<String, Integer> pair: map.entrySet()){
                System.out.println(pair.getValue() + " " + pair.getKey());
            }
        } else {
            for (Map.Entry<String, Integer> pair: map.entrySet()){
                System.out.println(pair.getValue() + " " + pair.getKey());
            }
            System.out.println(incorrectInput);
        }
    }
}
