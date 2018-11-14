package com.yodlee.design.patterns.creational.observer;

import java.util.List;

public interface Subject<T> {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyAllSubscribers(List<Observer> observers, T message);

    public void updateAllObservers(T message);
}