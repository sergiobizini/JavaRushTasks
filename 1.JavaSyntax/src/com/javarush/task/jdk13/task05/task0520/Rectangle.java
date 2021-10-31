package com.javarush.task.jdk13.task05.task0520;

/* 
Заполнить класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int top){
        this.top = top;
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int width, int height){
        this.width = width;
        this.height = height;
        this.top = top;
    }
    public Rectangle(int top, int left, int width, int height){
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public static void main(String[] args) {

    }
}
