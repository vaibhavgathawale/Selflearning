package New2026.Questions;

import java.util.List;
import java.util.stream.Collectors;

public class Q36CountFemaleEmployees {
    public static void main(String[] args) {
        // एकूण किती Female employees आहेत ते count करा.
        List<Employee> employees = EmployeeData.getEmployees();

        Long fEmp = employees.stream().filter(x -> x.getGender().equals("Female")).count();
        System.out.println(fEmp);
    }
}
