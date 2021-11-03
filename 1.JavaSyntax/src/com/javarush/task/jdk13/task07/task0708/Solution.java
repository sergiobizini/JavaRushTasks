package com.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Самое большое число
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 5; j++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        integers.sort(Comparator.reverseOrder());
        System.out.println(integers.get(0));
    }
}
