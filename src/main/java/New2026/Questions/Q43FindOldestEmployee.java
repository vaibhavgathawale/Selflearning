package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q43FindOldestEmployee {
    public static void main(String[] args) {
        // सर्व employees मधून सर्वात जास्त age असलेला Employee शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().max(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
    }
}
