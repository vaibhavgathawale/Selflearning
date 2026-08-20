package New2026.Questions;

import java.util.List;

public class Q08FindEmployeesAbove5YearsExperience {
    public static void main(String[] args) {

        // Q08FindEmployeesAbove5YearsExperience

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getExperience()>5).forEach(System.out::println);
    }
}
