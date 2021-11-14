package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Human implements CanRun, CanSwim {
    }
    public interface CanRun{
        public void runTo(int x,int y);
    }
    public interface CanSwim{
        public void swimTo(int x, int y, int d);
    }
}
