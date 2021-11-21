package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int a,b;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());

        int mcd = 1;

        for (int i = 1; i <= Math.min(a,b); i++) {
            if (a % i == 0 && b % i == 0){
                mcd = i;
            }
        }

        System.out.println(mcd);
    }
}
