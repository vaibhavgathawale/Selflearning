package New2026.Questions;

import java.util.List;

public class Q12FindActiveMaleAbove35 {
    public static void main(String[] args) {
        //Age 35 पेक्षा जास्त असलेले Active Male employees शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Male"))
                .filter(x -> x.getAge()>35)
                .filter(emp -> emp.isActive())
                .forEach(System.out::println);
    }
}
