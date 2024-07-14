package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.getObjectList();
//1.How many male and female employees are there in the organization?

        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .entrySet().forEach(System.out::println);

// 2.Print the name of all departments in the organization?
        employeeList.stream().map(Employee::getDepartment).distinct()
                .forEach(System.out::println);

//3.What is the average age of male and female employees?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
                .entrySet().forEach(System.out::println);

//4.Get the details of highest paid employee in the organization?
        employeeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).limit(1)
                .forEach(System.out::println);

//5.Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(Employee::getName)
                .forEach(System.out::println);

//6.Count the number of employees in each department?

        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().forEach(System.out::println);

//7.What is the average salary of each department?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))).entrySet();

//8.Get the details of youngest male employee in the product development department?
        Employee employee1 = employeeList.stream().filter(e -> e.getDepartment().equals("Product Development"))
                .min(Comparator.comparing(employee -> employee.getAge())).get();
        System.out.println(employee1);

//9.Who has the most working experience in the organization?
        Employee employee2 = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(employee2);

        System.out.println("----------------------------10-------------");
//10.How many male and female employees are there in the sales and marketing team?
        employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
                .forEach(System.out::println);

//11.What is the average salary of male and female employees?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().forEach(System.out::println);

//12.List down the names of all employees in each department?
        Map<String, List<Employee>> emp = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        emp.entrySet().forEach(stringListEntry -> System.out.println(stringListEntry.getKey()));

//13.What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream().mapToDouble(Employee::getSalary).summaryStatistics();
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics.getSum());

//14.Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Set<Map.Entry<Boolean, List<Employee>>> set = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 25)).entrySet();
        for (Map.Entry<Boolean, List<Employee>> m : set) {
            if (m.getKey()) {
                System.out.println("Employee older than 25");
                System.out.println(m.getValue());
            } else {
                System.out.println("Employee younger than 25");
                System.out.println(m.getValue());
            }

        }

//15.Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee x = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(x.age + ".." + x.department);

//16. Obtain a list of employees belongs to department “HR” with salary > 22700
        employeeList.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("HR") && employee.getSalary() > 22700)
                .forEach(System.out::println);
        System.out.println("----------------------------11-------------------------");
//17. Obtain a list of employees belongs to department “infrastructure” get salary and then apply 10% bonus
        employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("infrastructure"))
                .map(employee -> employee.getSalary() * 0.9).forEach(System.out::println);

//18.Get the 3  youngest employees
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge))
                .limit(3).forEach(System.out::println);

        //19.Get the 3  oldest employees
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
                .limit(3).forEach(System.out::println);

        //20.Get a list of employees which  joined in 2015, log the employee records to the console and then return their name
        employeeList.stream().filter(employee -> employee.getYearOfJoining() == 2015).peek(System.out::println)
                .map(employee -> employee.getName()).forEach(System.out::println);

//21.  Calculate total lump sum of salary of employees 2015
        Double sum = employeeList.stream().filter(employee -> employee.getYearOfJoining().equals(2015)).peek(System.out::println)
                .mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);

//22.  Calculate total average  of salary of employees 2015
        Double avg = employeeList.stream().filter(employee -> employee.getYearOfJoining().equals(2015))
                .mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(avg);

//23. Obtain a data map with emp name and dept
        employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getDepartment))
                .entrySet().forEach(System.out::println);

//24.Highest paid employee
     Employee employee3=   employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))).get();
        System.out.println(employee3);
    }
}
