package New2026.Questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q59HighestSalaryByGender {
    public static void main(String[] args) {
        // प्रत्येक Gender मधील सर्वात जास्त salary असलेला Employee शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Optional<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(result);
    }
}
