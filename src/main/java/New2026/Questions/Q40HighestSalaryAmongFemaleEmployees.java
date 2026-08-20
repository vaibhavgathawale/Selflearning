package New2026.Questions;

import java.util.List;

public class Q40HighestSalaryAmongFemaleEmployees {
    public static void main(String[] args) {
        // Female employees मधून सर्वात जास्त salary असलेला employee शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Female"))
                .mapToDouble(Employee::getSalary).max().ifPresent(System.out::println);
    }
}
