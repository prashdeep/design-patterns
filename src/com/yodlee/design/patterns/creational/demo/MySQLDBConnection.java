package com.yodlee.design.patterns.creational.demo;

public class MySQLDBConnection extends DBConnection {
    @Override
    public void open() {
        System.out.println("Open the MySQL DB Connection");
    }
}