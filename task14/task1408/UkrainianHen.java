package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    private String country = Country.UKRAINE;

    public int getCountOfEggsPerMonth(){
        return 150;
    }

    public String getDescription(){ return super.getDescription() + " Моя страна - " + country + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}
}
