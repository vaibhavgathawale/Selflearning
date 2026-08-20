package New2026.Questions;

import java.util.List;

public class Q28PrintFemaleEmployeeNames {
    public static void main(String[] args) {
        // सर्व Female employees ची फक्त नावे print करा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Female"))
                .map(x -> x.getName()).forEach(System.out::println);
    }
}
