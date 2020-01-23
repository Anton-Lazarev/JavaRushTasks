package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int passengers;

    public Plane(int value) { this.passengers = value; }

    @Override
    public void fly() {}
}
