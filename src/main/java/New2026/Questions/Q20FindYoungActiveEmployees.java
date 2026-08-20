package New2026.Questions;

import java.util.List;

public class Q20FindYoungActiveEmployees {
    public static void main(String[] args) {
        // Age 30 पेक्षा कमी आणि Active असलेले employees शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getAge()<30 && x.isActive())
                .forEach(System.out::println);
    }
}
