package New2026.Questions;

import java.util.List;

public class Q01FindITDepartmentEmployees {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT")).forEach(System.out::println);

    }
}
