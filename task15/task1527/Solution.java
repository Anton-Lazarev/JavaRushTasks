package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String parsingURL = reader.readLine();
        int startIndex = parsingURL.indexOf("?") + 1;
        char[] URLinChars = parsingURL.toCharArray();
        String fromChars = "";
        ArrayList<String> objValues = new ArrayList<>();
        boolean isObj = false, haveValue = false;

        for (int i = startIndex; i < URLinChars.length; i++) {
            if (URLinChars[i] == '='){
                System.out.print(fromChars + " ");
                if (fromChars.equals("obj")) isObj = true;
                haveValue = true;
                fromChars = "";
            } else if (URLinChars[i] == '&' && isObj){
                objValues.add(fromChars);
                fromChars = "";
            } else if (URLinChars[i] == '&' && haveValue) {
                fromChars = "";
                haveValue = false;
            } else if (URLinChars[i] == '&') {
                System.out.print(fromChars + " ");
                fromChars = "";
            } else {
                fromChars = fromChars + URLinChars[i];
            }
        }

        if (!objValues.isEmpty()){
            System.out.println();
            for (String objValue : objValues) {
                try {
                    alert(Double.parseDouble(objValue));
                } catch (Exception e) {
                    alert(objValue);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
