package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal("101"));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "";
        String bin = "";
        while(decimalNumber !=0) {
            bin = decimalNumber % 2 + bin;
            decimalNumber = decimalNumber / 2;
        }
        return bin;
    }

    public static int toDecimal(String binaryNumber) {
        if(binaryNumber == "" || binaryNumber == null) return 0;
        int dec = 0;
        int len = binaryNumber.length();
        for (int i = 0; i < binaryNumber.length(); i++) {
            dec +=  Character.getNumericValue(binaryNumber.charAt(len - i - 1)) * Math.pow(2,i);
        }
        return dec;
    }
}
