package com.javarush.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("%02d %02d %d", date.getDay(), date.getMonth() + 1, date.getYear() + 1900));
    }
}
