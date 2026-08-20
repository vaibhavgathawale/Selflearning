package New2026.Questions;

import java.util.Comparator;
import java.util.List;

public class Q48HighestSalaryITEmployee {
    public static void main(String[] args) {
        // IT department मधून सर्वात जास्त salary असलेला Employee शोधा.

        List<Employee>employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT"))
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

    }
}
