package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Nelson", "John");
        hashMap.put("Kvadra", "Alex");
        hashMap.put("Double", "John");
        hashMap.put("Super", "David");
        hashMap.put("Puper", "John");
        hashMap.put("Druper", "John");
        hashMap.put("Paratruper", "David");
        hashMap.put("Pereduper", "Kolin");
        hashMap.put("NedoSuper", "Michel");
        hashMap.put("Buber", "Zina");

        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> duplicateValues = new ArrayList<>();
        ArrayList<String> mapValues = new ArrayList<>();
        mapValues.addAll(map.values());

        for (int i = 0 ; i < mapValues.size(); ){
            String tmp = mapValues.get(i);
            int count = 0;
            for (int j = 0; j < mapValues.size(); ){
                if (mapValues.get(j).equals(tmp)){
                    count = count + 1;
                    if (count == 2) duplicateValues.add(tmp);
                    mapValues.remove(j);
                } else j++;
            }
        }

        for (int i = 0; i < duplicateValues.size(); i++)
            removeItemFromMapByValue(map, duplicateValues.get(i));
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
