package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        SimpleDateFormat fDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date newDate = fDate.parse(line);
        SimpleDateFormat f2date = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(f2date.format(newDate).toUpperCase());
    }
}
