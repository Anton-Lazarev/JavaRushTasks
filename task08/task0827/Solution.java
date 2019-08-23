package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date startYear = new Date();
        Date current = new Date();

        char[] tmpDate = date.toCharArray();
        String strYear = "", strMonth = "", strDay = "";
        int year = 0, month = 0, day = 0;

        int i = 0;
        boolean flag = true;
        while (flag){
            String tmp = String.valueOf(tmpDate[i]);
            if (tmp.equals(" ")) {
                i++;
                flag = false;
            } else {
            strMonth = strMonth + tmp;
            i++;
            }
        }
        flag = true;
        while (flag){
            String tmp = String.valueOf(tmpDate[i]);
            if (tmp.equals(" ")) {
                i++;
                flag = false;
            } else {
                strDay = strDay + tmp;
                i++;
            }
        }
        while (i != tmpDate.length){
            String tmp = String.valueOf(tmpDate[i]);
            strYear = strYear + tmp;
            i++;
        }

        if (strMonth.equals("JANUARY")) month = 0;
        else if (strMonth.equals("FEBRUARY")) month = 1;
        else if (strMonth.equals("MARCH")) month = 2;
        else if (strMonth.equals("APRIL")) month = 3;
        else if (strMonth.equals("MAY")) month = 4;
        else if (strMonth.equals("JUNE")) month = 5;
        else if (strMonth.equals("JULY")) month = 6;
        else if (strMonth.equals("AUGUST")) month = 7;
        else if (strMonth.equals("SEPTEMBER")) month = 8;
        else if (strMonth.equals("OCTOBER")) month = 9;
        else if (strMonth.equals("NOVEMBER")) month = 10;
        else if (strMonth.equals("DECEMBER")) month = 11;

        day = Integer.parseInt(strDay);
        year = Integer.parseInt(strYear);

        startYear.setMonth(0);
        startYear.setDate(1);
        startYear.setHours(0);
        startYear.setMinutes(0);
        startYear.setSeconds(0);
        startYear.setYear(year);

        current.setHours(0);
        current.setMinutes(0);
        current.setSeconds(0);
        current.setDate(day);
        current.setMonth(month);
        current.setYear(year);

        long msBetweenDates = current.getTime() - startYear.getTime();
        long msInDay = 24*60*60*1000;

        int days = (int) (msBetweenDates / msInDay) + 1;

        if (days % 2 == 1) return true;
        else return false;
    }
}
