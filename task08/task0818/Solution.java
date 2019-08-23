package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Ivanov", 5000);
        list.put("Petrov", 50);
        list.put("Sidorov", 5);
        list.put("Kuka", 1000);
        list.put("Icha", 700);
        list.put("Ish", 1471);
        list.put("Chak", 450);
        list.put("Chel", 5000);
        list.put("Kukul", 45678);
        list.put("Kan", 268);

        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}