package New2026.Questions;

import java.util.List;

public class Q13FindITEmployeesSalaryBetween50KAnd100K {
    public static void main(String[] args) {
        // IT department मधील employees ज्यांची salary ₹50,000 ते ₹1,00,000 च्या मध्ये आहे ते शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream()
                .filter(emp -> emp.getSalary()>=50000 && emp.getSalary()<=100000).forEach(System.out::println);
    }
}
