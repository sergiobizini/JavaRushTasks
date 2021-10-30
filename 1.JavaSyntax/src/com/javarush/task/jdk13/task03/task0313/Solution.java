package com.javarush.task.jdk13.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        System.out.printf("%1$s%2$s%3$s\n","Мама","Мыла","Раму");
        System.out.printf("%1$s%3$s%2$s\n","Мама","Мыла","Раму");
        System.out.printf("%2$s%1$s%3$s\n","Мама","Мыла","Раму");
        System.out.printf("%2$s%3$s%1$s\n","Мама","Мыла","Раму");
        System.out.printf("%3$s%1$s%2$s\n","Мама","Мыла","Раму");
        System.out.printf("%3$s%2$s%1$s\n","Мама","Мыла","Раму");
    }
}
