package New2026.Questions;

import java.util.List;

public class Q14FindInactiveEmployees {
    public static void main(String[] args) {
        // सर्व Inactive employees शोधा.

        List<Employee>employees = EmployeeData.getEmployees();

        employees.stream().filter(emp -> !emp.isActive()).forEach(System.out::println);
    }
}
