package NEW2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortBySalary {
    public static void main(String[] args) {
        // This program demostrate department in desending order and sort it by salary

        List<EmployeeSalary> empList = Arrays.asList(
                new EmployeeSalary("Vaibhav",11,  1000,"HR"),
                new EmployeeSalary("Swati", 22, 1500,"Medical"),
                new EmployeeSalary("Ashwini", 25, 2000,"Education"),
                new EmployeeSalary("Ram", 30, 5000,"Agro")
        );
        List<EmployeeSalary> result = empList.stream()
                .sorted(Comparator.comparing(EmployeeSalary::getDepartment,Comparator.reverseOrder()))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
