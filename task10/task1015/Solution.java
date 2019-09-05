package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayLists = new ArrayList[3];
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("array 1 ");
        arrayLists[0] = arr1;
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("array 2 ");
        arrayLists[1] = arr2;
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("array 3 ");
        arrayLists[2] = arr3;
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}