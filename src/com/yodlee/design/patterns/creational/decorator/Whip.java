package com.yodlee.design.patterns.creational.decorator;

public abstract class Whip extends Decorator {
    private Beverage beverage;

    private String description = "Whip - Decorator";

    public Whip(){}
    public Whip(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 10;
    }
}