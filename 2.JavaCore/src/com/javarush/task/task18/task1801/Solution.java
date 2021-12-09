package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        int max = Integer.MIN_VALUE;
        int cur;
        while (inputStream.available() > 0){
            cur = inputStream.read();
            if(cur > max) max = cur;
        }
        System.out.println(max);
        inputStream.close();
    }
}
