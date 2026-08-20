package New2026.Questions;

import java.util.List;

public class Q21FindMaleOrHighSalaryEmployees {
    public static void main(String[] args) {
        // Male employees किंवा salary ₹1,00,000 पेक्षा जास्त असलेले employees शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equalsIgnoreCase("Male") || x.getSalary()>100000)
                .forEach(System.out::println);
    }
}
