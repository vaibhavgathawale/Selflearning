package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q33FindHighestSalaryEmployee {
    public static void main(String[] args) {
        // सर्वात जास्त salary असलेला employee शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
    }
}
