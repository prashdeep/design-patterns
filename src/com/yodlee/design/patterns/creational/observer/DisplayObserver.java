package com.yodlee.design.patterns.creational.observer;

public class DisplayObserver<T> implements Observer<T> {
    @Override
    public void update(T message) {
        System.out.println("*******************");
        System.out.println("Inside the update method of DisplayObserver");
        System.out.println("updated message");
        System.out.println(message);
        System.out.println("**************************");
    }
}