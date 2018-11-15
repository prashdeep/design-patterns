package com.yodlee.design.patterns.creational.bridge;

public class WindowsOS implements OSProvider {
    @Override
    public String osName() {
        return "Windows 10";
    }

    @Override
    public OSType getOsType() {
        return OSType.WINDOWS;
    }
}