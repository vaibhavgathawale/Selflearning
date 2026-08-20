package New2026.Questions;

import java.util.List;

public class Q06FindEmployeesOutsideIndia {
    public static void main(String[] args) {

         // India मध्ये न राहणारे सर्व employees शोधा

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> !x.getAddress().equalsIgnoreCase("India"))
                .forEach(System.out::println);
    }
}
