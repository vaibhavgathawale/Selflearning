package New2026.Questions;

import java.util.List;

public class Q16FindEmployeesAgeBetween25And35 {
    public static void main(String[] args) {
        //Age 25 ते 35 दरम्यान असलेले employees शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getAge()>=25 && x.getAge()<=35).forEach(System.out::println);
    }
}
