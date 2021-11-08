package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Джон", dateFormat.parse("MAY 1 2012"));
        map.put("Стивен", dateFormat.parse("MAY 1 2012"));
        map.put("Джессика", dateFormat.parse("MAY 1 2012"));
        map.put("Альфред", dateFormat.parse("MAY 1 2012"));
        map.put("Том", dateFormat.parse("JULY 1 2012"));
        map.put("Катя", dateFormat.parse("JULY 1 2012"));
        map.put("Оля", dateFormat.parse("JULY 1 2012"));
        map.put("Маша", dateFormat.parse("AUGUST 1 2012"));
        map.put("Коля", dateFormat.parse("JUNE 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {
            if (pair.getValue().getMonth() + 1> 5 && pair.getValue().getMonth() + 1< 9) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
//        Map<String, Date> map = createMap();
//        System.out.println(map.size());
//        removeAllSummerPeople(map);
//        System.out.println(map.size());
    }
}
