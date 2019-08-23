package com.javarush.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> it = cats.iterator();
        Cat remove = it.next();
        cats.remove(remove);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> someCats = new HashSet<>();
        someCats.add(new Cat());
        someCats.add(new Cat());
        someCats.add(new Cat());
        return someCats;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static class Cat{

    }
}
