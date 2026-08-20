package New2026.Questions;

import java.util.List;

public class Q38AverageSalaryOfEmployees {
    public static void main(String[] args) {
        // सर्व employees ची average salary काढा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().mapToDouble(Employee::getSalary).average().ifPresent(System.out::println);
    }
}
