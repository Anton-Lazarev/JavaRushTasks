package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Ozzy", new Cat("Ozzy"));
        map.put("Gaga", new Cat("Gaga"));
        map.put("Ali", new Cat("Ali"));
        map.put("Noize", new Cat("Noize"));
        map.put("J-Z", new Cat("J-Z"));
        map.put("Akon", new Cat("Akon"));
        map.put("King", new Cat("King"));
        map.put("Jackson", new Cat("Jackson"));
        map.put("Laboda", new Cat("Laboda"));
        map.put("Buzova", new Cat("Buzova"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        set.addAll(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
