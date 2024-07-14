package interview;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
    public static List<Emp> createEmployees() {
        List<Emp> employeeList = new ArrayList<Emp>();

        employeeList.add(new Emp("shruti@gamil.com"));
        employeeList.add(new Emp("lavish@yahoo.com"));
        employeeList.add(new Emp("lavish@gamil.com"));
        employeeList.add(new Emp("shruti@yahoo.com"));
        employeeList.add(new Emp("shruti@epam.com"));
        employeeList.add(new Emp("lavish@epam.com"));
        employeeList.add(new Emp("shubh@gamil.com"));
        employeeList.add(new Emp("shubham@gamil.com"));
        employeeList.add(new Emp("dev@yahoo.com"));
        employeeList.add(new Emp("sona@epam.com"));
        employeeList.add(new Emp("ishi@epam.com"));
        employeeList.add(new Emp("neha@yahoo.com"));
        employeeList.add(new Emp("ved@gamil.com"));
        return employeeList;
    }
}