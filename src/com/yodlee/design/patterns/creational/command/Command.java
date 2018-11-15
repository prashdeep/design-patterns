package com.yodlee.design.patterns.creational.command;
@FunctionalInterface
public interface Command<T> {

    T execute(T t1, T t2);
}