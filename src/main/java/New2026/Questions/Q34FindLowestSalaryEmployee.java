package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q34FindLowestSalaryEmployee {
    public static void main(String[] args) {
        // सर्वात कमी salary असलेला employee शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().min(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }
}
