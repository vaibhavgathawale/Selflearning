package New2026.Questions;

import java.util.List;

public class Q25FindEmployeesWithSalaryAndExperience {
    public static void main(String[] args) {
        // Salary ₹80,000 पेक्षा जास्त आणि experience 5 वर्षांपेक्षा जास्त असलेले employees शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getSalary()>80000 && x.getExperience()>5)
                .forEach(System.out::println);
    }
}
