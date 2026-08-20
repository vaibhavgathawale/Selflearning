package New2026.Questions;

import java.util.List;

public class Q19FindHighSalaryExperiencedEmployees {
    public static void main(String[] args) {
        // ज्या employees ची salary ₹1,00,000 पेक्षा जास्त आणि experience 10 वर्षांपेक्षा जास्त आहे ते शोधा.
        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getSalary()>100000 && x.getExperience()>10)
                .forEach(System.out::println);
    }
}
