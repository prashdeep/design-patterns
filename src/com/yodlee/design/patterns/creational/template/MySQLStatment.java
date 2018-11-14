package com.yodlee.design.patterns.creational.template;

public class MySQLStatment implements Statement {
    @Override
    public void execute(String sql) {
        System.out.println("MySQL statement execute");
    }

    @Override
    public int executeUpdate(String sql) {
        System.out.println("Inside the executeUpdate method of MySQL");
        return 0;
    }
}