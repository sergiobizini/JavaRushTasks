package com.javarush.task.jdk13.task07.task0724;

/* 
Семья
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Joe", true, 99);
        Human grandpa2 = new Human("Sam", true, 100);

        Human grandma1 = new Human("Lisa", false, 19);
        Human grandma2 = new Human("Jessica", false, 111);

        Human dad = new Human("Richard", true, 30, grandpa1, grandma1);
        Human mom = new Human("Loise", false, 30, grandpa2, grandma2);

        Human kid1 = new Human("Marshall", true, 1, dad, mom);
        Human kid2 = new Human("Eve", false, 7, dad, mom);
        Human kid3 = new Human("Adam", true, 10, dad, mom);


        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());

        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());

        System.out.println(dad.toString());
        System.out.println(mom.toString());

        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}