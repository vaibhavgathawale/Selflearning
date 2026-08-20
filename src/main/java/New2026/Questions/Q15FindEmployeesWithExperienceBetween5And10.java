package New2026.Questions;

import java.util.List;

public class Q15FindEmployeesWithExperienceBetween5And10 {
    public static void main(String[] args) {
        // ज्या employees चा experience 5 ते 10 वर्षांच्या दरम्यान आहे ते शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getExperience() >=5)
                .filter(emp -> emp.getExperience()<=10)
                .forEach(System.out::println);
    }
}
