package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min_length = Integer.MAX_VALUE;
        int max_length = Integer.MIN_VALUE;
        int min_count = 0;
        int max_count = 0;
        int len = 0;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() < min_length) min_length = strings.get(i).length();
            if (strings.get(i).length() > max_length) max_length = strings.get(i).length();
        }
        for(String i: strings){
            if (i.length() == max_length || i.length() == min_length) {
                System.out.println(i);
                break;
            }
        }
    }
}
