package com.javarush.task.jdk13.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Joe", 21, "Moscow");
        Man man2 = new Man("Jack", 22, "Moscow");
        Woman woman1 = new Woman("Jill", 23, "Moscow");
        Woman woman2 = new Woman("Elena", 24, "Moscow");
        System.out.println(String.format("%s %d %s", man1.name, man1.age, man1.address));
        System.out.println(String.format("%s %d %s", man2.name, man2.age, man2.address));
        System.out.println(String.format("%s %d %s", woman1.name, woman1.age, woman1.address));
        System.out.println(String.format("%s %d %s", woman2.name, woman2.age, woman2.address));
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
