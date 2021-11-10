package com.javarush.task.jdk13.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {

    public static void main(String[] args) {
            int[] array = new int[2];
        try {
            array[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
}
