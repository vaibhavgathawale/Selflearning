package NEW2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestSalaryOfFemaleEmp {
    static class Employee {
        private String name;
        private String gender;
        private double salary;

        // Constructor, getters and setters

        public Employee(String name, String gender, double salary) {
            this.name = name;
            this.gender = gender;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', gender='" + gender + "', salary=" + salary + "}";
        }
    }
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList( new Employee("Alice", "Female", 12000),
                new Employee("Bob", "Male", 15000),
                new Employee("Cathy", "Female", 9000),
                new Employee("Diana", "Female", 11000));

        List<Employee> femaleEmployeesWithHighSalary = employees.stream()
                .filter(emp -> "Female".equalsIgnoreCase(emp.getGender()))
                .filter(emp -> emp.getSalary() > 10000)
                .collect(Collectors.toList());

        femaleEmployeesWithHighSalary.forEach(System.out::println);
    }
}
