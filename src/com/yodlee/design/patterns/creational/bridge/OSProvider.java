package com.yodlee.design.patterns.creational.bridge;

public interface OSProvider {

    public String osName();

    public OSType getOsType();
}