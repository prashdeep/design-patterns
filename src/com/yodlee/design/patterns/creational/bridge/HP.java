package com.yodlee.design.patterns.creational.bridge;

public class HP extends Manufacturer {

    public HP(OSProvider osProvider) {
        super(osProvider);
    }

    @Override
    public void printOSName() {
        System.out.println(super.osProvider.osName());
    }
}