package New2026.Questions;

import java.util.List;

public class Q49AverageSalaryOfFemaleEmployees {
    public static void main(String[] args) {
        // सर्व Female employees ची average salary काढा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Female"))
                .mapToDouble(Employee::getSalary)
                .average()
                .ifPresent(System.out::println);
    }
}
