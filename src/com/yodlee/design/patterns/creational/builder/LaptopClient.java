package com.yodlee.design.patterns.creational.builder;

public class LaptopClient {
    public static void main(String[] args) {

        Laptop customLaptop = new Laptop.LaptopBuilder(4, 250, "4")
                .setModelSize("15")
                .setFingerPrintScannerRequired(false)
                .setMsOfficeRequired(true)
                .build();

        System.out.println(customLaptop.isMsOfficeRequired());
    }
}