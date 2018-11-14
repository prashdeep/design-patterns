package com.yodlee.design.patterns.creational.strategy;

public class FilterEmployeesLT25 implements Predicate {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() < 25;
    }
}