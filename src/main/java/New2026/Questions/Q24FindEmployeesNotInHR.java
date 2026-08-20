package New2026.Questions;

import java.util.List;

public class Q24FindEmployeesNotInHR {
    public static void main(String[] args) {
        // HR department मध्ये नसलेले सर्व employees शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> !x.getDepartment().equals("HR"))
                .forEach(System.out::println);
    }
}
