package com.yodlee.design.patterns.creational.demo;

public class OracleDBConnection extends DBConnection {
    @Override
    public void open() {
        System.out.println("Opened the Oracle DB connection");
    }
}