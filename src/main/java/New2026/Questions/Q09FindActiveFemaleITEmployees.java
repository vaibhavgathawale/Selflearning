package New2026.Questions;

import java.util.List;

public class Q09FindActiveFemaleITEmployees {
    public static void main(String[] args) {

        // IT department मधील Active Female employees शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT"))
                .filter(x -> x.isActive())
                .filter(x -> x.getGender().equals("Female"))
                .forEach(System.out::println);

        //// Second way
        employees.stream()
                .filter(x -> x.getDepartment().equals("IT")
                        && x.isActive()
                        && x.getGender().equals("Female"))
                .forEach(System.out::println);
    }
}
