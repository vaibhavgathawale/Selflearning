package New2026.Questions;

import java.util.List;
import java.util.stream.Collectors;

public class Q35CountActiveEmployees {
    public static void main(String[] args) {
        // एकूण किती Active employees आहेत ते count करा.
        List<Employee> employees = EmployeeData.getEmployees();

       Long result = employees.stream().filter(emp -> emp.isActive()).collect(Collectors.counting());
        System.out.println(result);
    }
}
