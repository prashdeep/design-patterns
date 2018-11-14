package com.yodlee.design.patterns.creational.iterator;

public interface Iterator<T> {

    boolean hasNext();

    T next();
}