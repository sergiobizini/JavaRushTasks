package com.javarush.task.task14.task1421;

public class Singleton {
    private static int count = 0;
    private static Singleton instance;
    private Singleton(){
        count = 1;
    }
    public static Singleton getInstance(){
        if (count != 1) {
            instance =  new Singleton();
        }
        return instance;
    }
}
