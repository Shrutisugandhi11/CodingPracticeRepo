package org.example.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static  List<Employee> addEmp(){
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Kaushal Jani", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Harshil Nagar", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Raj Darbar", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Sid Barot", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Pruthvi Soni", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Parth Dabgar", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Ashish Patel", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Aaalap Patel", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Divyesh Solanki", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Jay Solanki", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Kishan Panchal", 31, "Male", "Product Development", 2012, 35700.0));
return employeeList;
    }
}

