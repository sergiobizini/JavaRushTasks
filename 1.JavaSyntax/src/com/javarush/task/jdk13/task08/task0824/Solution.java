package com.javarush.task.jdk13.task08.task0824;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Вся семья в сборе
*/


public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<Human>();
        Human child1 = new Human("Kate", false, 11);
        Human child2 = new Human("Jane", false, 7);
        Human child3 = new Human("Tom", true, 3);

        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human dad = new Human("Richard", true, 37, children);
        Human mom = new Human("Jessica", false, 35, children);

        children.clear();
        children.add(dad);

        Human grandpa1 = new Human("John", true, 37, children);
        Human grandma1 = new Human("Lisa", false, 35, children);

        children.clear();
        children.add(mom);

        Human grandpa2 = new Human("Alfred", true, 37, children);
        Human grandma2 = new Human("Teresa", false, 35, children);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        System.out.println(dad.toString());
        System.out.println(mom.toString());

        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = null;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(children);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children == null) return text;
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
