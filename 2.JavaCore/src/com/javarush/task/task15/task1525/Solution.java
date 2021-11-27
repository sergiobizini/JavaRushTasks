package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String line = reader.readLine();
            while (line != null){
                lines.add(line);
                line = reader.readLine();
            }
        } catch(Exception e){
            System.out.println(e.getStackTrace()[0]);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
