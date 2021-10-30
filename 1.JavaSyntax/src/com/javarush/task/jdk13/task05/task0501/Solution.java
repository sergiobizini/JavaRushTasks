package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

public class Solution {

    public static class Cat {
        public String name;
        public int age;
        public int weight;
        public int strength;

        public Cat(String name, int age, int weight, int strength){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom",5, 2, 6);
        Cat cat2 = new Cat("Bob",4, 3, 5);
        Cat cat3 = new Cat("Pussy",3, 4, 4);
    }
}
