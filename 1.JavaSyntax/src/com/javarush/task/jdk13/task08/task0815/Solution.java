package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>(10);
        map.put("Иванов","Иван");
        map.put("Петров","Сергей");
        map.put("Сидоров","Петр");
        map.put("Кунаев","Александр");
        map.put("Анохин","Семен");
        map.put("Журавлев","Олег");
        map.put("Солодов","Николай");
        map.put("Марков","Станислав");
        map.put("Никитский","Федор");
        map.put("Олеринский","Тимофей");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for(Map.Entry i : map.entrySet()){
            if (i.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry i : map.entrySet()) {
            if (i.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
