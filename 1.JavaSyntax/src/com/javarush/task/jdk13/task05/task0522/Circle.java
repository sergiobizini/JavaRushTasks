package com.javarush.task.jdk13.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x,y,10);
    }
    public Circle(double radius) {
        this(5,5,radius);
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {

    }
}