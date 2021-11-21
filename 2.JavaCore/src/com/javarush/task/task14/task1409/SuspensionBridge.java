package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge{
    private int carsCount;
    public SuspensionBridge(){
        carsCount = 10;
    }

    @Override
    public int getCarsCount() {
        return carsCount;
    }
}
