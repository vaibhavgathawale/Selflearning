package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q42FindYoungestEmployee {
    public static void main(String[] args) {
        // सर्व employees मधून सर्वात कमी age असलेला Employee शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
    }
}
