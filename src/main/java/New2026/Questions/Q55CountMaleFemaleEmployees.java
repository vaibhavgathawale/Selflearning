package New2026.Questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q55CountMaleFemaleEmployees {
    public static void main(String[] args) {
        // Male आणि Female employees किती आहेत ते count करा.
        List<Employee> employees = EmployeeData.getEmployees();

       Map<String,Long> ls = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(ls);
    }
}
