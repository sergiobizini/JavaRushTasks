package com.javarush.task.jdk13.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        result = text.repeat(5);
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        result = text.repeat(count);
        return result;
    }

    public static void main(String[] args) {

    }
}
