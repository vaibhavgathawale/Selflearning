package New2026.Questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q60HighestSalaryActiveInactive {
    public static void main(String[] args) {
        // Active आणि Inactive employees मधून प्रत्येक group मधील highest salary employee शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

       Map<Boolean, Optional<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::isActive,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(result);
    }
}
