package com.javarush.task.jdk13.task12.task1203;

/* 
Сознательный выбор
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        if (l - (byte) l == 0) return true;
        return false;
    }

    public static boolean isShort(long l) {
        if (l - (short) l == 0) return true;
        return false;
    }

    public static boolean isInt(long l) {
        if (l - (int) l == 0) return true;
        return false;
    }
}
