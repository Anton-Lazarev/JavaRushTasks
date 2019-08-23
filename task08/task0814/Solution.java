package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(35);
        set.add(15);
        set.add(3);
        set.add(0);
        set.add(4);
        set.add(46);
        set.add(6);
        set.add(2);
        set.add(876);
        set.add(54);
        set.add(23);
        set.add(7);
        set.add(5);
        set.add(456);
        set.add(44);
        set.add(8);
        set.add(9);
        set.add(2456);
        set.add(4563);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {

    for (Iterator<Integer> i = set.iterator(); i.hasNext(); ){
        Integer temp = i.next();
        if (temp > 10) i.remove();
    }
    return set;
    }

    public static void main(String[] args) {

    }
}
