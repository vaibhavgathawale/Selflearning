package New2026.Questions;

import java.util.List;
import java.util.stream.Collectors;

public class Q05FindFemaleEmployees {
    public static void main(String[] args) {

        // सर्व Female employees जे India मध्ये राहतात ते शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

       List<Employee> FList =  employees.stream()
                .filter(employee -> employee.getGender().equals("Female"))
                .filter(location -> location.getAddress().equalsIgnoreCase("India"))
                .collect(Collectors.toList());

        FList.forEach(System.out::println);
    }
}
