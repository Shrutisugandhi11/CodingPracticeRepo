package EmployeeLambda;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpLambda {
    public static void main(String[] args) {
        List<Emp>empList= EmpList.createEmployees();
       // Q8) There is a list of Employees and Employee object has a field called e-mail.
      // Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain.
        Map<String, Long> collect1 = empList.stream().map(W -> W.getEmail().substring(W.getEmail().indexOf('@')))
                .collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(collect1);


    }
}
