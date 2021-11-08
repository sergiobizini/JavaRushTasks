package com.javarush.task.jdk13.task08.task0817;

import java.net.CookieHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена
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
        map.put("Олеринский","Федор");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (Collections.frequency(map.values(), pair.getValue()) > 1) removeItemFromMapByValue(map, pair.getValue());
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//    Map<String, String> map = createMap();
//    System.out.println(map.toString());
//    removeTheFirstNameDuplicates(map);
//    System.out.println(map.toString());
    }
}
