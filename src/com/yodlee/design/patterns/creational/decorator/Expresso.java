package com.yodlee.design.patterns.creational.decorator;

public abstract class Expresso extends Beverage {

    public Expresso(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 100;
    }
}