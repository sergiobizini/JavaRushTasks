package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); InputStream file = new FileInputStream(reader.readLine())){
            byte[] bytes = new byte[file.available()];
            file.read(bytes);
            System.out.println(new String(bytes));
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
}