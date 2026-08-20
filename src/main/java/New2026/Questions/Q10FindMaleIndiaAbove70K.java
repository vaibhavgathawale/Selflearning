package New2026.Questions;

import java.util.List;

public class Q10FindMaleIndiaAbove70K {
    public static void main(String[] args) {

        //India मध्ये राहणारे Male employees ज्यांची salary ₹70,000 पेक्षा जास्त आहे ते शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equals("Male") && x.getAddress().equalsIgnoreCase("India"))
                .filter(salary -> salary.getSalary() > 70000)
                .forEach(System.out::println);
    }
}
