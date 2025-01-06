package com.suresh.JAVA8_FEATURES.Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HighestSalaryEmployeeListClient1 {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Hari", 90000));
        employeeList.add(new Employee(2, "Ram", 91000));
        employeeList.add(new Employee(3, "Krishna", 92000));
        employeeList.add(new Employee(4, "Govinda", 93000));
        employeeList.add(new Employee(5, "Hare", 95000));
        employeeList.add(new Employee(6, "Muraree", 95000));


        employeeList.stream().forEach(System.out::println); //Display all employee
        //employeeList.stream().filter(employee -> employee.getSalary()> 93000).forEach(System.out::println); //Display employee whose salary >93000

        //employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println); //Display employee in reverse order

        //employeeList.subList(3,5).stream().forEach(System.out::println);//print the employee sublist of id =4 and 5.

        System.out.println("*******************************************");
        employeeList.forEach(System.out::println);
        System.out.println("*******************************************");
        employeeList.stream().forEach(System.out::println);




    }
}
