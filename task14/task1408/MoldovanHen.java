package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    private String country = Country.MOLDOVA;

    public int getCountOfEggsPerMonth(){
        return 200;
    }

    public String getDescription(){ return super.getDescription() + " Моя страна - " + country + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}
}
