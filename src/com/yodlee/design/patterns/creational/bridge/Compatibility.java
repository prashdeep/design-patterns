package com.yodlee.design.patterns.creational.bridge;

public interface Compatibility {

    public boolean isCompatible(ManufactureType manufactureType, OSType osType);
}