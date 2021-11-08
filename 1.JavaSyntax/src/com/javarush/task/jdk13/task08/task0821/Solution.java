package com.javarush.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>(10);
        map.put("Иванов","Иван");
        map.put("Петров","Сергей");
        map.put("Сидоров","Петр");
        map.put("Кунаев","Александр");
        map.put("Анохин","Семен");
        map.put("Журавлев","Олег");
        map.put("Марков","Николай");
        map.put("Марков","Станислав");
        map.put("Никитский","Федор");
        map.put("Олеринский","Федор");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
