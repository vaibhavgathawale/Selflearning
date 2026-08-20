package New2026.Questions;

import java.util.List;

public class Q39AverageSalaryOfITEmployees {
    public static void main(String[] args) {
        // फक्त IT department मधील employees ची average salary काढा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT"))
                .mapToDouble(Employee::getSalary).average().ifPresent(System.out::println);
    }
}
