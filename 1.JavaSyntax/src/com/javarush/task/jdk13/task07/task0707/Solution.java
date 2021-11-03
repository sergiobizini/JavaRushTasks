package com.javarush.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 различных строк в списке
*/

public class Solution {
    
    public static ArrayList<String> list;
    
    public static void main(String[] args) {
        list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(list.size());
        for(String i: list) System.out.println(i);
    }
}
