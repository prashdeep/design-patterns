package com.yodlee.design.patterns.creational.observer;

public class ObserverClient {

    public static void main(String[] args) {
        Subject topic = new Topic();

        Observer displayObserver = new DisplayObserver();
        Observer observer2 = new Observer2();

        topic.subscribe(displayObserver);
        topic.subscribe(observer2);

         topic.updateAllObservers(34);
         topic.unsubscribe(observer2);
        topic.updateAllObservers("There is a one more new  blog");

    }
}