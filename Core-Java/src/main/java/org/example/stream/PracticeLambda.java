package org.example.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeLambda {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.getObjectList();
        //1.How many male and female employees are there in the organization?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
                .entrySet().forEach(System.out::println);
        //2.Print the name of all departments in the organization?
        employeeList.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);

        //3 What is the average age of male and female employees?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)))
                .entrySet().forEach(System.out::println);

        //4.Get the details of highest paid employee in the organization?
        employeeList.stream().max(Comparator.comparing(Employee::getSalary)).stream().forEach(System.out::println);
        employeeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

        //5.Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(employee -> employee.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);

        //6.Count the number of employees in each department?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .entrySet().forEach(System.out::println);

        //7.What is the average salary of each department?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().forEach(System.out::println);

        //8.Get the details of youngest male employee in the product development department?
        employeeList.stream().map(Employee::getAge).sorted().limit(1).forEach(System.out::println);
        employeeList.stream().min(Comparator.comparing(Employee::getAge)).stream().limit(1).forEach(System.out::println);

        //9.Who has the most working experience in the organization?
        employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).stream().forEach(System.out::println);

        //10.How many male and female employees are there in the sales and marketing team?
        employeeList.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("sales and marketing"))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().forEach(System.out::println);

        //11.What is the average salary of male and female employees?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);

        //12.List down the names of all employees in each department?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(e->System.out.println(e.getValue()));

    Double d=employeeList.stream().filter(employee -> employee.getYearOfJoining()==2015).collect(Collectors.averagingDouble(Employee::getSalary));
        Double avg = employeeList.stream().filter(employee -> employee.getYearOfJoining().equals(2015))
                .mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(d+";;;;;;;;;;;;;;;;"+avg);


        List<Integer> l= Arrays.asList(1,2,3,1,2,3,4,5);
        l.stream().distinct().forEach(System.out::println);
        l.stream().mapToInt(i->i*i).filter(i->i>10).average();
        l.stream().map(i->Collections.frequency(l,i)).forEach(System.out::println);
        l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);

        System.out.println(maxSubArraySum(new int[]{1,2,3,4,5,6,7,8,9}));

    }
    static String  maxSubArraySum(int a[])
    {
        int max=a[0];
        int min=a[0];
        for (int i:a){
            if(max < i)
                max=i;
            if(min>i){
                min=i;
            }
        }
       return min+":::::::::::"+max;
    }
}
