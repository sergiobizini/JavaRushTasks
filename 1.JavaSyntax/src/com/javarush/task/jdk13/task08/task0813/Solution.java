package com.javarush.task.jdk13.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>(20);
        char ch = 'ф';
        for (int i = 0; i < 20; i++) {
            ch = (char) (i + 1072);
            set.add("Л" + ch);
        }
        return set;
    }

    public static void main(String[] args) {
    }
}
