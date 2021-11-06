package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int max_len = 0;
        int length = 0;
        int elem = list.get(0);
        for(int i: list){
            if(i == elem) length++;
            else {
                length = 1;
                elem = i;
            }
            if (length > max_len) {
                max_len = length;
            }
        }
        System.out.println(max_len);
    }
}
