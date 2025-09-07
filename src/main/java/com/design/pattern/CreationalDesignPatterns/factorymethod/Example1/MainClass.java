package com.design.pattern.CreationalDesignPatterns.factorymethod.Example1;

public class MainClass {
    public static void main(String[] args) {
        Transport truck = new Truck();
        truck.deliver();

        Transport ship = new Ship();
        ship.deliver();
    }
}
