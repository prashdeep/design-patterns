package com.yodlee.design.patterns.creational.decorator;

public class Milk extends Decorator {
    private Beverage beverage;

    private String description = "Milk - Decorator";

    public Milk(){}
    public Milk(String description) {
        super(description);
    }

    public Milk(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 10;
    }
}