package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private boolean sex;
        private String name;
        private int age;
        private Human mother;
        private Human father;
        private boolean hasWork;

        public Human(boolean inSex, String inName, int inAge, Human inMother, Human inFather, boolean inHasWork){
            this.sex = inSex;
            this.age = inAge;
            this.name = inName;
            this.hasWork = inHasWork;
            this.mother = inMother;
            this.father = inFather;
        }

        public Human(){
            this.sex = true;
            this.age = 20;
            this.name = "default name";
            this.hasWork = false;
            this.mother = null;
            this.father = null;
        }

        public Human(boolean inSex, String inName, int inAge, boolean inHasWork){
            this.sex = inSex;
            this.age = inAge;
            this.name = inName;
            this.hasWork = inHasWork;
            this.mother = null;
            this.father = null;
        }

        public Human(boolean inSex, boolean inHasWork){
            this.sex = inSex;
            this.age = 20;
            this.name = "default name";
            this.hasWork = inHasWork;
            this.mother = null;
            this.father = null;
        }

        public Human(boolean inSex, int inAge, String inName){
            this.sex = inSex;
            this.age = inAge;
            this.name = inName;
            this.hasWork = false;
            this.mother = null;
            this.father = null;
        }

        public Human(String inName, Human inMother, Human inFather){
            this.sex = true;
            this.age = 20;
            this.name = inName;
            this.hasWork = false;
            this.mother = inMother;
            this.father = inFather;
        }

        public Human(String inName, Human inMother){
            this.sex = true;
            this.age = 20;
            this.name = inName;
            this.hasWork = false;
            this.mother = inMother;
            this.father = null;
        }

        public Human(Human inFather, String inName){
            this.sex = true;
            this.age = 20;
            this.name = inName;
            this.hasWork = false;
            this.mother = null;
            this.father = inFather;
        }

        public Human(int inAge, String inName, Human inMother){
            this.sex = true;
            this.age = inAge;
            this.name = inName;
            this.hasWork = false;
            this.mother = inMother;
            this.father = null;
        }

        public Human(int inAge, Human inFather, String inName){
            this.sex = true;
            this.age = inAge;
            this.name = inName;
            this.hasWork = false;
            this.mother = null;
            this.father = inFather;
        }
    }
}
