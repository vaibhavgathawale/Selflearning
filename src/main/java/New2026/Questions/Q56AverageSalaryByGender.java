package New2026.Questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q56AverageSalaryByGender {
    public static void main(String[] args) {
        // Male आणि Female employees ची वेगवेगळी average salary काढा.

        List<Employee> employees = EmployeeData.getEmployees();

        Map<String,Double> empList =  employees.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(empList);
    }
}
