package New2026.Questions;

import java.util.List;

public class Q27PrintEmployeeNamesFromIT {
    public static void main(String[] args) {
        // फक्त IT department मधील employees ची नावे print करा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT"))
                .map(x -> x.getName()).forEach(System.out::println);
    }
}
