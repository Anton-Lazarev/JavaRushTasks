package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Sidr", 45, "street Nova, house 34, flat 64");
        Man man2 = new Man("Petr", 15, "street Mira, house 86, flat 33");
        Woman woman1 = new Woman("Lera", 20, "street Yana, house 93, flat 68");
        Woman woman2 = new Woman("Liza", 18, "street Lenina, house 34, flat 48");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        private String name, address;
        private int age;

        public Man(String inName, int inAge, String inAddress){
            this.name = inName;
            this.age = inAge;
            this.address = inAddress;
        }

        public Man(){
            this("Vasya", 30, null);
        }

        public Man(String inName, int inAge){
            this(inName, inAge, null);
        }

        public Man(int inAge, String inAddress){
            this("Vasya", inAge, inAddress);
        }

        public Man(String inName, String inAddress){
            this(inName, 30, inAddress);
        }
    }

    public static class Woman {
        private String name, address;
        private int age;

        public Woman(String inName, int inAge, String inAddress){
            this.name = inName;
            this.age = inAge;
            this.address = inAddress;
        }

        public Woman(){
            this("Lola", 25, null);
        }

        public Woman(String inName, int inAge){
            this(inName, inAge, null);
        }

        public Woman(int inAge, String inAddress){
            this("Lola", inAge, inAddress);
        }

        public Woman(String inName, String inAddress){
            this(inName, 25, inAddress);
        }
    }
}
