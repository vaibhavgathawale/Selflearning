package New2026.Questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q58AverageAgeByDepartment {
    public static void main(String[] args) {
        // प्रत्येक Department मधील employees ची average age काढा.
        List<Employee> employees = EmployeeData.getEmployees();

        Map<String,Double> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getAge)));
        System.out.println(result);
    }
}
