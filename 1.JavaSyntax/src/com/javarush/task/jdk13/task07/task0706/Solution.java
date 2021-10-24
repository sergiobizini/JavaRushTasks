package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s_even = 0, s_odd = 0;
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                s_even += array[i];
            }
            else {
                s_odd += array[i];
            }
        }
        if (s_even > s_odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        if (s_even < s_odd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
