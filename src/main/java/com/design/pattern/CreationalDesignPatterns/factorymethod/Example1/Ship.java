package com.design.pattern.CreationalDesignPatterns.factorymethod.Example1;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("deliver by ship");
    }
}
