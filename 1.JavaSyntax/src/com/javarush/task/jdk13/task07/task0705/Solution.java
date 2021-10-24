package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i < 10) {
                array1[i] = array[i];
            }
            else {
                array2[i-10] = array[i];
            }
        }
        for (int j = 0 ; j < array2.length ; j++) {
            System.out.println(array2[j]);
        }
    }
}
