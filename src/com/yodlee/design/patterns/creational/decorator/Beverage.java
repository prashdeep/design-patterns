package com.yodlee.design.patterns.creational.decorator;

public abstract class Beverage {

    private  String description;

    public Beverage(String description){
        this.description = description;
    }

    public Beverage() {

    }

    public abstract double cost();

    public abstract String getDescription();
}