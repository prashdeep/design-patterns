package com.yodlee.design.patterns.creational.observer;

public class Observer2<T> implements Observer<T> {

    @Override
    public void update(T message) {
        System.out.println("^^^^^^^^^^^^^^^^^^^");
        System.out.println("Inside another observer");
        System.out.println(message);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
    }
}