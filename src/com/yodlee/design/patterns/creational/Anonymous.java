package com.yodlee.design.patterns.creational;

public class Anonymous {

    Runnable target = ()-> System.out.println("Inside the run method of Runnable interface");

}