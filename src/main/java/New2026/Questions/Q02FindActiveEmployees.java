package New2026.Questions;

import java.util.List;

public class Q02FindActiveEmployees {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.isActive()).forEach(System.out::println);
    }
}
