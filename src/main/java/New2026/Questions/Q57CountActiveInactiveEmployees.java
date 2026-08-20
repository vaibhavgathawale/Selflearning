package New2026.Questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q57CountActiveInactiveEmployees {
    public static void main(String[] args) {
        // Active आणि Inactive employees किती आहेत ते count करा.
        List<Employee> employees = EmployeeData.getEmployees();

        Map<Boolean,Long> result = employees.stream().collect(Collectors.groupingBy(Employee::isActive,Collectors.counting()));
        System.out.println(result);
    }
}
