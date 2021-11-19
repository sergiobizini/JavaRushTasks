package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); BufferedWriter file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())))){
            String line;
            do {
                line = reader.readLine();
                file.write(line);
                file.newLine();
            } while (!line.equals("exit"));
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
