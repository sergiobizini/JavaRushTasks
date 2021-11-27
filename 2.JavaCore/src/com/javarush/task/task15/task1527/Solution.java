package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] params = url.split("\\?")[1].split("&");
        Map<String,String> map = new HashMap<>();
        for (String s: params){
            if (s.split("=").length > 1){
                map.put(s.split("=")[0],s.split("=")[1]);
            } else {
                map.put(s.split("=")[0],"");
            }
            System.out.print(s.split("=")[0] + " ");
        }
        System.out.println();
        for (Map.Entry<String,String> pair: map.entrySet()){
            if (pair.getKey().equals("obj")){
                try {
                    double d = new Double(pair.getValue()).doubleValue();
                    alert(d);
                } catch (NumberFormatException e){
                    alert(pair.getValue());
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
