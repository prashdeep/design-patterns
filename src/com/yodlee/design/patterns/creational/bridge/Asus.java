package com.yodlee.design.patterns.creational.bridge;

public class Asus extends Manufacturer {
    public Asus(OSProvider osProvider) {
        super(osProvider);
    }

    @Override
    public void printOSName() {
        System.out.println(super.osProvider.osName());
    }
}