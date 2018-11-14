package com.yodlee.design.patterns.creational.decorator;

public class Capuccino extends Beverage {

    public Capuccino(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 100;
    }
}