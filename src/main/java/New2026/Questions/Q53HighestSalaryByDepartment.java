package New2026.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class Q53HighestSalaryByDepartment {
    public static void main(String[] args) {
        // प्रत्येक Department मधील सर्वात जास्त salary शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Optional<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
         Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(result);
    }
}
