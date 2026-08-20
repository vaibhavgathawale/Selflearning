package New2026.Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q41LowestSalaryAmongMaleEmployees {
    public static void main(String[] args) {

        // Male employees मधून सर्वात कमी salary असलेला Employee शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Male"))
                .min(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }

}
