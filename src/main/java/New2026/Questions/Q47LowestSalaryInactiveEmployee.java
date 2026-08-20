package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q47LowestSalaryInactiveEmployee {
    public static void main(String[] args) {
        // Inactive employees मधून सर्वात कमी salary असलेला Employee शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> !x.isActive())
                .min(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }
}
