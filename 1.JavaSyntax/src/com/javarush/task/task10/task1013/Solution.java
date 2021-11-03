package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int height;
        private int weight;
        private String name;
        private char sex;
        private String job;

        public Human(){
            age = 0;
            height = 0;
            weight = 0;
            name = "Noname";
            sex = 'n';
            job = "Unemployed";
        }
        public Human(String name){
            age = 0;
            height = 0;
            weight = 0;
            this.name = name;
            sex = 'n';
            job = "Unemployed";
        }
        public Human(String name, String job){
            age = 0;
            height = 0;
            weight = 0;
            this.name = name;
            sex = 'n';
            this.job = job;
        }
        public Human(String name, int age){
            this.age = age;
            height = 0;
            weight = 0;
            this.name = name;
            sex = 'n';
            job = "Unemployed";
        }
        public Human(String name, int age, char sex){
            this.age = age;
            height = 0;
            weight = 0;
            this.name = name;
            this.sex = sex;
            job = "Unemployed";
        }
        public Human(String name, int height, int weight){
            age = 0;
            this.height = height;
            this.weight = weight;
            this.name = name;
            sex = 'n';
            job = "Unemployed";
        }
        public Human(String name, int height, int weight, int age){
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.name = name;
            sex = 'n';
            job = "Unemployed";
        }
        public Human(String name, char sex){
            age = 0;
            height = 0;
            weight = 0;
            this.name = name;
            this.sex = sex;
            job = "Unemployed";
        }
        public Human(String name, int height, int weight, char sex){
            age = 0;
            this.height = height;
            this.weight = weight;
            this.name = name;
            this.sex = sex;
            job = "Unemployed";
        }
        public Human(String name, int age, int height, int weight, char sex){
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.name = name;
            this.sex = sex;
            job = "Unemployed";
        }
    }
}
