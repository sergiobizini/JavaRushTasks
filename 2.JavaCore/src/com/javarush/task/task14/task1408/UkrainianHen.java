package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    public UkrainianHen(){
        this.countOfEggsPerMonth = 100;
    }
    public int getCountOfEggsPerMonth(){
        return countOfEggsPerMonth;
    }
    public String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(),Country.UKRAINE,this.getCountOfEggsPerMonth());
    }
}
