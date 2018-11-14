package com.yodlee.design.patterns.creational.iterator;

import java.util.Arrays;

public class IteratorImpl<T> implements Iterator<T> {

    private final T[] array;

    private int index;

    public IteratorImpl(T[] array){
        this.array = array;
    }
    @Override
    public boolean hasNext() {
         int localIndex = index;
        return array[localIndex + 1] != null;
    }

    @Override
    public T next() {
        if(hasNext()){
            int loop = index++;
            return array[loop];
        }
        return null;
    }
}