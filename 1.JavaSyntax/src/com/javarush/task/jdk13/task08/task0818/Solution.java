package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>(10);
        map.put("Иванов",1_599);
        map.put("Петров",2_000);
        map.put("Сидоров",100);
        map.put("Кунаев",123);
        map.put("Анохин",7_500);
        map.put("Журавлев",1_000_000);
        map.put("Солодов",9_999);
        map.put("Марков",8_892);
        map.put("Никитский",1_109);
        map.put("Олеринский",7_777);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}