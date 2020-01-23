package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    private String country = Country.RUSSIA;

    public int getCountOfEggsPerMonth(){
        return 400;
    }

    public String getDescription(){ return super.getDescription() + " Моя страна - " + country + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}
}
