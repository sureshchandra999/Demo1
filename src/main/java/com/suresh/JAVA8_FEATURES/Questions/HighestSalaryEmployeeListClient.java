package com.suresh.JAVA8_FEATURES.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryEmployeeListClient {
    public static void main(String[] args) {

        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 70000));
        employees.add(new Employee(2, "Bob", 80000));
        employees.add(new Employee(3, "Charlie", 80000));
        employees.add(new Employee(4, "David", 60000));
        employees.add(new Employee(5, "David", 50000));
        employees.add(new Employee(6, "David", 150000));
        employees.add(new Employee(7, "David", 170000));
        employees.add(new Employee(8, "David", 180000));
        employees.add(new Employee(9, "David", 180000));
        employees.add(new Employee(10, "David", 180000));


        // Step 1: Find the maximum salary
        Optional<Double> maxSalary = employees.stream()
                .map(Employee::getSalary)
                .max(Double::compare);

        // Step 2: Get the list of employees with the maximum salary
        List<Employee> highestPaidEmployees = employees.stream()
                .filter(emp -> emp.getSalary() == maxSalary.orElse(0.0))
                .collect(Collectors.toList());

        // Print the highest paid employees
        System.out.println("Highest Paid Employees:");
        highestPaidEmployees.forEach(System.out::println);
    }

    
}
