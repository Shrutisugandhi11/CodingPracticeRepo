package org.example.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpPractice {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeList.addEmp();
        //How many male and female employees are there in the organization?
        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet().forEach(System.out::println);
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge))).entrySet().forEach(System.out::println);
        Double salMax = employees.stream().map(Employee::getSalary).reduce(Double::max).get();
        System.out.println(salMax);
        employees.stream().sorted(((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))).limit(1).forEach(System.out::println);
        employees.stream().filter(employee -> employee.yearOfJoining > 2015).forEach(System.out::println);
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().forEach(System.out::println);
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);
        Employee emp = employees.stream().filter(e -> (e.getDepartment().equalsIgnoreCase("Product Development") && e.getGender().equalsIgnoreCase("male"))).min((emp1, emp2) -> (emp1.getAge() - emp2.getAge())).get();
        System.out.println(emp.toString());
        employees.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).limit(1).forEach(System.out::println);
        employees.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().forEach(System.out::println);
        employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach((e)-> System.out.println(e.getKey()+".."+e.getValue().stream().map(e1->e1.getName()).collect(Collectors.toList())));

        employees.stream().mapToDouble(e1-> e1.getSalary()).summaryStatistics();
        employees.stream().collect(Collectors.partitioningBy(employee -> employee.age>25)).entrySet().forEach((e)->System.out.println(e.getValue()));
       Employee employee= employees.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(employee.getName()+"..."+employee.getDepartment());



    }
}
