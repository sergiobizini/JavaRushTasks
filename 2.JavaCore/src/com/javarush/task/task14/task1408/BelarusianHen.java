package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{

    public BelarusianHen(){
        this.countOfEggsPerMonth = 100;
    }

    public int getCountOfEggsPerMonth(){
        return countOfEggsPerMonth;
    }
    public String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(),Country.BELARUS,this.getCountOfEggsPerMonth());
    }
}