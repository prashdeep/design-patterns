package com.yodlee.design.patterns.creational.iterator;

public class Collection<T> {

    private T[] array;

    public Collection(T[] array){
        this.array = array;
    }

    public Iterator<T> iterator(){
        return new IteratorImpl<>(array);
    }

}