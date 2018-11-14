package com.yodlee.design.patterns.creational;


import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton singleton;

    private Singleton (){
        System.out.println("The constuctor is called ..");
        // cannot be called outside this class
    }

    protected Object readResolve(){
        System.out.println("Came inside the readResolve method");
        return getInstance();
    }

    public static  Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}