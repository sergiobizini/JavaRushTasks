package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }


    public interface CanFly{
        public void FlyTo (int x, int y, int h);
    }
    public interface CanRun{
        public void FlyTo (int x, int y);
    }
    public interface CanSwim{
        public void FlyTo (int x, int y, int d);
    }

}
