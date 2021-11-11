package com.javarush.task.jdk13.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void divideByZero(){
        int a = 1/0;
        System.out.println(a);
    }
    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
