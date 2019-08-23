package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human lola = new Human();
        lola.name = "Lola";
        lola.age = 15;
        lola.sex = false;

        Human mark = new Human();
        mark.name = "Mark";
        mark.age = 18;
        mark.sex = true;

        Human john = new Human();
        john.name = "John";
        john.age = 8;
        john.sex = true;

        Human piter = new Human();
        piter.name = "Piter";
        piter.age = 45;
        piter.sex = true;
        piter.children.add(lola);
        piter.children.add(mark);
        piter.children.add(john);

        Human mary = new Human();
        mary.name = "Mary";
        mary.age = 40;
        mary.sex = false;
        mary.children.add(lola);
        mary.children.add(mark);
        mary.children.add(john);

        Human eric = new Human();
        eric.name = "Eric";
        eric.age = 66;
        eric.sex = true;
        eric.children.add(piter);

        Human adel = new Human();
        adel.name = "Adel";
        adel.age = 62;
        adel.sex = false;
        adel.children.add(piter);

        Human rob = new Human();
        rob.name = "Rob";
        rob.age = 64;
        rob.sex = true;
        rob.children.add(mary);

        Human lil = new Human();
        lil.name = "Lil";
        lil.age = 60;
        lil.sex = false;
        lil.children.add(mary);

        System.out.println(rob);
        System.out.println(lil);
        System.out.println(eric);
        System.out.println(adel);
        System.out.println(piter);
        System.out.println(mary);
        System.out.println(lola);
        System.out.println(mark);
        System.out.println(john);
    }

    public static class Human {
        public String name;
        boolean sex;
        public int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
