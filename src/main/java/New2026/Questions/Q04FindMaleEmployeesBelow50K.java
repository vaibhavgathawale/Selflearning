package New2026.Questions;

import java.util.List;

public class Q04FindMaleEmployeesBelow50K {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

                 employees.stream()
                .filter(x -> x.getGender().equalsIgnoreCase("MALE"))
                .filter(salary -> salary.getSalary()<50000)
                .forEach(System.out::println);
    }
}
