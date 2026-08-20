package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q46HighestSalaryActiveEmployee {
    public static void main(String[] args) {
        // Active employees मधून सर्वात जास्त salary असलेला Employee शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.isActive())
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }
}
