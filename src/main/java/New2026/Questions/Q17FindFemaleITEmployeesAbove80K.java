package New2026.Questions;

import java.util.List;

public class Q17FindFemaleITEmployeesAbove80K {
    public static void main(String[] args) {
        // IT department मधील Female employees ज्यांची salary ₹80,000 पेक्षा जास्त आहे ते शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT") && x.getGender().equals("Female"))
                .filter(emp -> emp.getSalary()>80000)
                .forEach(System.out::println);

    }
}
