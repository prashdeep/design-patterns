package com.yodlee.design.patterns.creational.factory;

public class CarFactory {

    private CarFactory(){}

    public static Car createCar(){
        return new Car();
    }

    public static Car createCar(String color, String make, String model){
        return  new Car(color, make, model);
    }
}