package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q31SortEmployeesBySalaryAscending {
    public static void main(String[] args) {
        // सर्व employees ना salary च्या ascending order मध्ये sort करून print करा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
