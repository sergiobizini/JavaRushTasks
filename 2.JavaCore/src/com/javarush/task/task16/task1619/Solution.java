package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        Solution.TestThread.setIsInterrupted();
    }

    public static class TestThread implements Runnable {
        public static boolean isInterrupted;
        public void run() {
            while (!isInterrupted) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
        public static void setIsInterrupted(){
            isInterrupted = true;
        }
    }
}
