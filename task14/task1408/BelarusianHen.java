package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    private String country = Country.BELARUS;

    public int getCountOfEggsPerMonth(){
        return 250;
    }

    public String getDescription(){ return super.getDescription() + " Моя страна - " + country + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}
}
