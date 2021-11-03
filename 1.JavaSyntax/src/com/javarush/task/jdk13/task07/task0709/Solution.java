package com.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая короткая строка
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min_length = Integer.MAX_VALUE;
        for (int j = 0; j < 5; j++) {
            strings.add(reader.readLine());
            if (strings.get(j).length() < min_length) min_length = strings.get(j).length();
        }
        for (String i: strings){
            if (i.length() == min_length) System.out.println(i);
        }
    }
}
