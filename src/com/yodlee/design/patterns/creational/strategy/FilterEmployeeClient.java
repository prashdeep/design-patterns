package com.yodlee.design.patterns.creational.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FilterEmployeeClient {

    private  Predicate predicate;

    public FilterEmployeeClient(Predicate<Employee> predicate){
        this.predicate = predicate;
    }

    public  List<Employee> filterEmployees(List<Employee> employeeList){
        Iterator<Employee> iterator = employeeList.iterator();
        List<Employee> filteredList = new ArrayList<>();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(predicate.test(employee)){
                filteredList.add(employee);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {

        List<Employee> empList = fetchEmployees();
        Predicate<Employee> ageBeyween25And40= (employee) -> (employee.getAge() > 25 && employee.getAge() <= 40);
        FilterEmployeeClient employeeClient = new FilterEmployeeClient(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return (employee.getAge() > 25 && employee.getAge() <= 40);
            }
        });
        List<Employee> filteredEmployees = employeeClient.filterEmployees(empList);

        Iterator<Employee> iterator = filteredEmployees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    private static List<Employee> fetchEmployees() {
        return Arrays.asList(
                new Employee(12,"Kiran" , 40),
                new Employee(14, "Vinay", 24),
                new Employee(13, "Vikram", 45),
                new Employee(20, "Anish", 28)
        );
    }
}