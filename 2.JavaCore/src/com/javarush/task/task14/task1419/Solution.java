package com.javarush.task.task14.task1419;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new RuntimeException());
        exceptions.add(new IOException());
        exceptions.add(new InterruptedException());
        exceptions.add(new IndexOutOfBoundsException());

        exceptions.add(new IllegalArgumentException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new NullPointerException());


    }
}
