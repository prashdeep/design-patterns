package com.yodlee.design.patterns.creational.decorator;

public class ExtraChoclate extends Decorator {
    private Beverage beverage;

    private String description = "Extra Choclate- Decorator";

    public ExtraChoclate(){}

    public ExtraChoclate(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return this.beverage.getDescription()+"Extra Choclate ";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 10;
    }
}