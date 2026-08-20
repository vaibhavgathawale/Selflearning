package New2026.Questions;

import java.util.List;

public class Q11FindFemaleOutsideIndiaBelow100K {
    public static void main(String[] args) {

        // India बाहेर राहणाऱ्या Female employees ज्यांची salary ₹1,00,000 पेक्षा कमी आहे ते शोधा.

        List<Employee>employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getGender().equalsIgnoreCase("Female"))
                .filter(x -> !x.getAddress().equalsIgnoreCase("India"))
                .filter(employee -> employee.getSalary()<100000)
                .forEach(System.out::println);
    }
}
