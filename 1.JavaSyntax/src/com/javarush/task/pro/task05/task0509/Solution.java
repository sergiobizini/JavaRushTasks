package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                MULTIPLICATION_TABLE[i-1][j-1] = i*j;
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
