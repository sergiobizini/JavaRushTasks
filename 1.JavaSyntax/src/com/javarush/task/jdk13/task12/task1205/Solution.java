package com.javarush.task.jdk13.task12.task1205;

/* 
А мне так нужно
*/

public class Solution {

    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        if (number instanceof Byte) return number.byteValue() / 2 + "b";
        if (number instanceof Integer) return String.valueOf(number.intValue() / 3);
        if (number instanceof Double) return String.valueOf(number.doubleValue() * 20);
        return "Я такого типа числа не жду!";
    }
}
