package com.javarush.task.task14.task1404;

import javax.lang.model.element.NestingKind;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        CatFactory factory = new CatFactory();
        while (!str.isEmpty()) {
           Cat cat =  factory.getCatByKey(str);
           if (cat instanceof FemaleCat) {
               FemaleCat fcat = (FemaleCat) cat;
               System.out.println(fcat.toString());
           } else if (cat instanceof MaleCat) {
               MaleCat mcat = (MaleCat) cat;
               System.out.println(mcat.toString());
           }
           else {
               System.out.println(cat.toString());
           }
           cat.toString();
           str = reader.readLine();
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + this.getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + this.getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + this.getName();
        }
    }
}
