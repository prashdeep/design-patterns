package com.yodlee.design.patterns.creational.strategy;

public class FilterEmployeesGT40 implements Predicate {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() > 40;
    }
}