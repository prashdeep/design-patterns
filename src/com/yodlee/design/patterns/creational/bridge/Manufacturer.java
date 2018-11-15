package com.yodlee.design.patterns.creational.bridge;

public abstract class Manufacturer {

     final OSProvider osProvider;
     final ManufactureType manufactureType;

    public Manufacturer(ManufactureType type, OSProvider osProvider){
        this.osProvider = osProvider;
        this.manufactureType = type;
    }

    public abstract void printOSName();


}