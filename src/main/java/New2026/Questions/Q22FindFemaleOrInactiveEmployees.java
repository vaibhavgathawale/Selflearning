package New2026.Questions;

import java.util.List;

public class Q22FindFemaleOrInactiveEmployees {
    public static void main(String[] args) {
        // Female employees किंवा Inactive employees शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Female") || !x.isActive())
                .forEach(System.out::println);
    }
}
