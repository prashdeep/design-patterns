package com.yodlee.design.patterns.creational.adaptor;

@FunctionalInterface
public interface Adaptee {

    public void printAddress(String... address);
}