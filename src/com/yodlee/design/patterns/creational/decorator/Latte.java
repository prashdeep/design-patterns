package com.yodlee.design.patterns.creational.decorator;

public class Latte extends Beverage{

    public Latte(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 100;
    }
}