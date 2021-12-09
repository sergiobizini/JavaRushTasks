package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        int min = Integer.MAX_VALUE;
        int cur;
        while (inputStream.available() > 0){
            cur = inputStream.read();
            if(cur < min) min = cur;
        }
        System.out.println(min);
        inputStream.close();

    }
}
