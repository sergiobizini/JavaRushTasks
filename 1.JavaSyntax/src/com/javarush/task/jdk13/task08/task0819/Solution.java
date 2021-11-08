package com.javarush.task.jdk13.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.removeIf(x->x.name.equals("cat1"));

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        cats.forEach(System.out::println);
    }

    public static class Cat{
        public static int count = 0;
        public String name;
        public Cat(String name){
            this.name = name;
        }
        public Cat(){
            count++;
            this.name = "cat" + count;
        }
    }

}
