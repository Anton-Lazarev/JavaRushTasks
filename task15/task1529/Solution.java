package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (Exception e) {}
    }

    public static CanFly result;

    public static void reset() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.equals("helicopter")) result = new Helicopter();
        else if (name.equals("plane")) result = new Plane(Integer.parseInt(reader.readLine()));
        reader.close();
    }
}
