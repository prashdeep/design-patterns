package com.yodlee.design.patterns.creational.bridge;

public class Linux implements OSProvider {
    @Override
    public String osName() {
        return "Linux";
    }
}