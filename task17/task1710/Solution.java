package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        try {
            int id;
            char sex;

            switch (args[0]) {
                case "-i":
                    id = Integer.parseInt(args[1]);
                    String lastName = allPeople.get(id).getName();
                    if (allPeople.get(id).getSex().equals(Sex.MALE)) sex = 'м';
                    else sex = 'ж';
                    SimpleDateFormat forOutput = new SimpleDateFormat("d-MMM-y", Locale.ENGLISH);
                    System.out.println(lastName + " " + sex + " " + forOutput.format(allPeople.get(id).getBirthDate()));
                    break;
                case "-d":
                    id = Integer.parseInt(args[1]);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDate(null);
                    break;
                case "-c":
                    sex = args[2].charAt(0);
                    if (sex == 'м') allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                    else allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                    System.out.println(allPeople.size() - 1);
                    break;
                case "-u":
                    id = Integer.parseInt(args[1]);
                    sex = args[3].charAt(0);
                    allPeople.get(id).setName(args[2]);
                    if (sex == 'м') allPeople.get(id).setSex(Sex.MALE);
                    else allPeople.get(id).setSex(Sex.FEMALE);
                    allPeople.get(id).setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
                    break;
            }
        } catch (Exception e) { }
    }
}
