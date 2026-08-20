package New2026.Questions;

import java.util.List;

public class Q18FindActiveEmployeesOutsideIndia {
    public static void main(String[] args) {
        // India बाहेर राहणारे आणि Active असलेले employees शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> !x.getAddress().equals("India") &&  x.isActive())
                .forEach(System.out::println);
    }
}
