package com.design.pattern.CreationalDesignPatterns.factorymethod.Example1;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by truck");
    }
}
