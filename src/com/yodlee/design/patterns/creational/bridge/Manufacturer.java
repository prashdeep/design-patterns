package com.yodlee.design.patterns.creational.bridge;

public abstract class Manufacturer {

     final OSProvider osProvider;

    public Manufacturer(OSProvider osProvider){
        this.osProvider = osProvider;
    }

    public abstract void printOSName();


}