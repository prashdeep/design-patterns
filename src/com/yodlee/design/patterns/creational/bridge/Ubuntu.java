package com.yodlee.design.patterns.creational.bridge;

public class Ubuntu implements OSProvider {

    @Override
    public String osName() {
        return "Ubuntu";
    }

    @Override
    public OSType getOsType() {
        return OSType.UBUNTU;
    }
}