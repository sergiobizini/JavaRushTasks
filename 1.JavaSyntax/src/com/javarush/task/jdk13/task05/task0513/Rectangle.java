package com.javarush.task.jdk13.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top){
        this.top = top;
    }
    public void initialize(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int width, int height){
        this.width = width;
        this.height = height;
        this.top = top;
    }
    public void initialize(int top, int left, int width, int height){
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }


    public static void main(String[] args) {

    }
}
