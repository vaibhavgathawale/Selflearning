package New2026.Questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q54LowestSalaryByDepartment {
    public static void main(String[] args) {
        // प्रत्येक Department मधील सर्वात कमी salary असलेला Employee शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String, Optional<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(result);

        System.out.println("======================= Answer Madhun Optional Kadhyche aslyas ====================================");

        Map<String, Employee> result2 =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                                        Optional::get)));

        System.out.println(result2);

    }
}
