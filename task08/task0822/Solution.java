package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size()-1; i++)
            if (array.get(i+1) <= array.get(i)) min = array.get(i+1);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        ArrayList<Integer> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) list.add(Integer.parseInt(input.readLine()));
        return list;
    }
}
