package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex("010101001"));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary("10"));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null ) return "";
        if (binaryNumber.matches(".*[^0-1].*") || binaryNumber.equals("")) return "";
        return decToHex(binToDecimal(binaryNumber));
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null ) return "";
        if (hexNumber.matches(".*[^0-9abcdef].*") || hexNumber.equals("")) return "";
        String bin = "";
        for (int i = 0; i < hexNumber.length() ; i++) {
            System.out.println(decToBinary(hexToDecimal("" + hexNumber.charAt(i))));
            bin = bin + decToBinary(hexToDecimal("" + hexNumber.charAt(i)));
        }
        return (bin.length() % 4 !=0) ? String.format("%0" + (4 - bin.length() % 4) + "d", 0) + bin: bin;
    }
    public static String decToHex(int decimalNumber) {
//        if (decimalNumber <= 0) return "";
        String hex = "";
        while(decimalNumber != 0) {
            hex = HEX.charAt(decimalNumber % 16) + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }

    public static int hexToDecimal(String hexNumber) {
//        if(hexNumber == "" || hexNumber == null) return 0;
        int dec = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            dec = 16 * dec + HEX.indexOf(hexNumber.charAt(i));
        }
        return dec;
    }
    public static String decToBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "0000";
        String bin = "";
        while(decimalNumber !=0) {
            bin = decimalNumber % 2 + bin;
            decimalNumber = decimalNumber / 2;
        }
        return (bin.length() % 4 !=0) ? String.format("%0" + (4 - bin.length() % 4) + "d", 0) + bin: bin;
    }

    public static int binToDecimal(String binaryNumber) {
//        if(binaryNumber == "" || binaryNumber == null) return 0;
        int dec = 0;
        int len = binaryNumber.length();
        for (int i = 0; i < binaryNumber.length(); i++) {
            dec +=  Character.getNumericValue(binaryNumber.charAt(len - i - 1)) * Math.pow(2,i);
        }
        return dec;
    }
}
