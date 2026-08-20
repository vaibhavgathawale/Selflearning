package New2026.Questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q52AverageSalaryByDepartment {
    public static void main(String[] args) {
        // प्रत्येक Department ची average salary काढा.
        List<Employee>employees = EmployeeData.getEmployees();

        Map<String,Double> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(result);
    }
}
