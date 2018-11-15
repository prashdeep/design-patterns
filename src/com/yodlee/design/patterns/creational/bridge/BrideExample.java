package com.yodlee.design.patterns.creational.bridge;

public class BrideExample {

    public static void main(String[] args) {
        OSProvider windows10 = new WindowsOS();
        OSProvider ubuntu = new Ubuntu();


        HP hpManufacturerWithWindows = new HP(windows10);
        HP hpManufacturerWithUbuntu = new HP(ubuntu);

        hpManufacturerWithUbuntu.printOSName();
        hpManufacturerWithWindows.printOSName();
    }
}