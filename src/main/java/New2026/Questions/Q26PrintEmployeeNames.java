package New2026.Questions;

import java.util.List;

public class Q26PrintEmployeeNames {
    public static void main(String[] args) {
        // सर्व employees ची फक्त name print करा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().map(x -> x.getName()).forEach(System.out::println);
    }
}
