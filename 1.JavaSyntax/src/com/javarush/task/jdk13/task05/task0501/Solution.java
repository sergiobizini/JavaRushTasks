package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

public class Solution {

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
        public boolean fight(Cat anotherCat){
            int zero = 0, neg = 0, pos = 0;
            int[] delta = new int[3];
            delta[0] = this.age - anotherCat.age;
            delta[1] = this.weight - anotherCat.weight;
            delta[2] = this.strength - anotherCat.strength;

            for (int i: delta){
                if (i < 0) neg++;
                if (i > 0) pos++;
                if (i == 0) zero++;
            }

            if(pos >=2 || (pos == 1 && zero == 2)) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom",5, 2, 6);
        Cat cat2 = new Cat("Bob",4, 3, 5);
        Cat cat3 = new Cat("Pussy",3, 4, 4);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }
}
