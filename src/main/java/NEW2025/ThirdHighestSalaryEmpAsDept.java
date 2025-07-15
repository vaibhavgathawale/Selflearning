package NEW2025;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdHighestSalaryEmpAsDept {
    public static void main(String[] args) {


        /*It will return 3 highest salary of employee as per each department*/


        List<EmployeeSalary> employees = Arrays.asList(
                new EmployeeSalary("Rohan",22,350445122,"Medical"),
                new EmployeeSalary("Sohan",23,250,"Docter"),
                new EmployeeSalary("Deepak",31,550,"Docter"),
                new EmployeeSalary("Suraj",30,950,"Docter"),
                new EmployeeSalary("Ram",26,400,"SocalWork"),
                new EmployeeSalary("Radha",28,600,"Hospital"),
                new EmployeeSalary("Punit",52,900,"Eduction"));

        Map<String, Optional<EmployeeSalary>> thirdSalary = employees.stream()
                .collect(Collectors.groupingBy(EmployeeSalary::getDepartment,Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparingDouble(EmployeeSalary::getSalary).reversed())
                                .skip(2)
                                .findFirst())));

        // Print results
        thirdSalary.forEach((dept, empOpt) ->
                System.out.println(dept + " → " + empOpt.orElse(null)));

    }
}
