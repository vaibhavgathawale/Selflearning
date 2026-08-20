package New2026.Questions;

import java.util.List;

public class Q50AverageExperienceOfActiveEmployees {
    public static void main(String[] args) {
        // फक्त Active employees चा average experience काढा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.isActive())
                .mapToDouble(Employee::getExperience)
                .average()
                .ifPresent(System.out::println);
    }
}
