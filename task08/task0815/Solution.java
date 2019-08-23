package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ivanov", "Ivan");
        hashMap.put("Petrov", "Ivan");
        hashMap.put("Kulikov", "Petr");
        hashMap.put("Kulik", "Ivan");
        hashMap.put("Kuka", "Vadim");
        hashMap.put("Vadimovich", "Lena");
        hashMap.put("Pochki", "Opa");
        hashMap.put("Opachki", "Petr");
        hashMap.put("Kuku", "Epta");
        hashMap.put("Epta", "Ivan");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int tmp = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)) tmp = tmp + 1;
        }

        return tmp;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int tmp = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(lastName)) tmp = tmp + 1;
        }

        return tmp;

    }

    public static void main(String[] args) {
    }
}
