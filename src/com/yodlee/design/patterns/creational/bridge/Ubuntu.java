package com.yodlee.design.patterns.creational.bridge;

public class Ubuntu implements OSProvider {

    @Override
    public String osName() {
        return "Ubuntu";
    }
}