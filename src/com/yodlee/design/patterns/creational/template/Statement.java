package com.yodlee.design.patterns.creational.template;

public interface Statement {

    void execute(String sql);

    int executeUpdate(String sql);

}