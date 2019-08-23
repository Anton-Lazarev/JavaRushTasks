package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        map.put("Dikaprio", df.parse("JULY 5 1970"));
        map.put("Chaplin", df.parse("APRIL 13 1990"));
        map.put("Blum", df.parse("MARCH 20 1912"));
        map.put("Del-torro", df.parse("JANUARY 30 1985"));
        map.put("Depp", df.parse("AUGUST 25 1963"));
        map.put("Lopez", df.parse("SEPTEMBER 22 1999"));
        map.put("Richi", df.parse("NOVEMBER 18 2000"));
        map.put("Chan", df.parse("DECEMBER 19 2005"));
        map.put("Papan", df.parse("FEBRUARY 24 2010"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) iterator.remove();
        }

    }

    public static void main(String[] args) {

    }
}
