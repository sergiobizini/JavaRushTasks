package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge{

    private int carsCount;
    public WaterBridge(){
        carsCount = 15;
    }

    @Override
    public int getCarsCount() {
        return carsCount;
    }

}
