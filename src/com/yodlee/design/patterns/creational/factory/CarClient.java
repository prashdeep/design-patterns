package com.yodlee.design.patterns.creational.factory;

public class CarClient {
    public static void main(String[] args) {
        Car one = CarFactory.createCar();
        Car two = CarFactory.createCar("Red","2018", "RZX");
        Car three = CarFactory.createCar("Red","2018", "RZX");

        System.out.println(one ==two);
        System.out.println(two == three);
        System.out.println(one == three);

    }
}