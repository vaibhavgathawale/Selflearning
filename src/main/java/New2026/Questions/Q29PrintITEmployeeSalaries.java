package New2026.Questions;

import java.util.List;

public class Q29PrintITEmployeeSalaries {
    public static void main(String[] args) {
        // IT department मधील सर्व employees ची फक्त salary print करा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT"))
                .map(x -> x.getSalary()).forEach(System.out::println);


    }
}
