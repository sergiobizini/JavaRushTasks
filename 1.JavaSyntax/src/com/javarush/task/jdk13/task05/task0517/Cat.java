package com.javarush.task.jdk13.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    Cat(){
        weight = 10;
        age = 10;
        color = "black";
        name = null;
        address = null;
    }

    public Cat(String name){
        this.name = name;
        this.weight = 10;
        this.age = 10;
        this.color = "black";
        this.address = null;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
        this.address = null;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
        this.address = null;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.age = 10;
        this.address = null;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 10;
    }

    public static void main(String[] args) {

    }
}
