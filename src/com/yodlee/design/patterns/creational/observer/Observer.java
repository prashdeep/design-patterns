package com.yodlee.design.patterns.creational.observer;

public interface Observer<T> {
    void update(T message);
}