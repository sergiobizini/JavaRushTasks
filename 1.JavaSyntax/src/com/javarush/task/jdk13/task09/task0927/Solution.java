package com.javarush.task.jdk13.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> map = new HashMap<>();
        map.put("Cat1",new Cat("Cat1"));
        map.put("Cat2",new Cat("Cat2"));
        map.put("Cat3",new Cat("Cat3"));
        map.put("Cat4",new Cat("Cat4"));
        map.put("Cat5",new Cat("Cat5"));
        map.put("Cat6",new Cat("Cat6"));
        map.put("Cat7",new Cat("Cat7"));
        map.put("Cat8",new Cat("Cat8"));
        map.put("Cat9",new Cat("Cat9"));
        map.put("Cat10",new Cat("Cat10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for(Map.Entry pair: map.entrySet()){
            set.add((Cat) pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
