package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); Scanner scan = new Scanner(new FileInputStream(reader.readLine()))){
            List<Integer> list = new ArrayList<>();
            while (scan.hasNext()){
                int a = scan.nextInt();
                if (a % 2 == 0) list.add(a);
            }
            Collections.sort(list);

            for(Integer i: list){
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
}
