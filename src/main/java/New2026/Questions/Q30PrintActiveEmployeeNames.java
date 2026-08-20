package New2026.Questions;

import java.util.List;

public class Q30PrintActiveEmployeeNames {
    public static void main(String[] args) {
        // फक्त Active employees ची नावे print करा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.isActive())
                .map(x -> x.getName())
                .forEach(System.out::println);

    }
}
