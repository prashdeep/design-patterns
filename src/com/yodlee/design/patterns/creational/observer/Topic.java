package com.yodlee.design.patterns.creational.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Topic<T> implements Subject<T> {
    List<Observer> observers= new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllSubscribers(List<Observer> observers, T message) {
        for(Observer observer: observers){
            observer.update(message);
        }
    }

    public void updateAllObservers(T message){
        System.out.println("Updating all the observers ..");
        notifyAllSubscribers(observers, message);
    }
}