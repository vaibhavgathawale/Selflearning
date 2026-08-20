package New2026.Questions;

import java.util.List;

public class Q03FindFemaleEmployeesAbove80K {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Female"))
                .filter(salary -> salary.getSalary()>80000)
                .forEach(System.out::println);
    }
}
