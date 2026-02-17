package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvarageSalaryOfEmployee {
    public static void main(String[] args) {

        List<EmployeeSalary> empList = Arrays.asList(
                new EmployeeSalary("Vaibhav",11,  1000,"HR"),
                new EmployeeSalary("Swati", 22, 1500,"Medical"),
                new EmployeeSalary("Ashwini", 25, 2000,"Education"),
                new EmployeeSalary("Ram", 30, 5000,"Agro")
        );

        OptionalDouble avgSalary = empList.stream()
                .mapToDouble(EmployeeSalary::getSalary)
                .average();

        if (avgSalary.isPresent()) {
            System.out.println("Average Salary: " + avgSalary.getAsDouble());
        } else {
            System.out.println("Employee list is empty.");
        }
    }
}
