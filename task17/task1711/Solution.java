package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        int id;
        char sex;

        switch (args[0]) {
            case "-i": synchronized (allPeople) {
                for (int i = 1; i < args.length; i++) {
                    id = Integer.parseInt(args[i]);
                    String lastName = allPeople.get(id).getName();
                    if (allPeople.get(id).getSex() == Sex.MALE) sex = 'м';
                    else sex = 'ж';
                    SimpleDateFormat forOutput = new SimpleDateFormat("d-MMM-y", Locale.ENGLISH);
                    System.out.println(lastName + " " + sex + " " + forOutput.format(allPeople.get(id).getBirthDate()));
                }
            }
            break;
            case "-d": synchronized (allPeople) {
                for (int i = 1; i < args.length; i++) {
                    id = Integer.parseInt(args[i]);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDate(null);
                }
            }
            break;
            case "-c": synchronized (allPeople) {
                for (int i = 1; i < args.length; i = i + 3) {
                    try {
                        sex = args[i + 1].charAt(0);
                        if (sex == 'м')
                            allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                        else
                            allPeople.add(Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                        System.out.println(allPeople.size() - 1);
                    } catch (Exception e) { }
                }
            }
            break;
            case "-u": synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        try {
                            id = Integer.parseInt(args[i]);
                            sex = args[i + 2].charAt(0);
                            allPeople.get(id).setName(args[i + 1]);
                            if (sex == 'м') allPeople.get(id).setSex(Sex.MALE);
                            else allPeople.get(id).setSex(Sex.FEMALE);
                            allPeople.get(id).setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 3]));
                        } catch (Exception e) { }
                    }
                }
            }
        }
    }
