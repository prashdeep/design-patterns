package com.yodlee.design.patterns.creational.decorator;

public abstract class Decorator extends Beverage {

    private Beverage beverage;

    public Decorator(){}
    public Decorator(String description) {
        super(description);
    }

    public Decorator(Beverage beverage){
        super();
        this.beverage = beverage;
    }
    public abstract double cost();
}