package New2026.Questions;

import java.util.List;

public class Q07FindEmployeesAbove30 {
    public static void main(String[] args) {

        // Age 30 पेक्षा जास्त असलेले सर्व employees शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getAge()>30).forEach(System.out::println);
    }
}
