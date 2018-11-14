package com.yodlee.design.patterns.creational.strategy;

import java.util.function.Predicate;

public class FilterEmployeesLT25 implements Predicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() < 25;
    }
}