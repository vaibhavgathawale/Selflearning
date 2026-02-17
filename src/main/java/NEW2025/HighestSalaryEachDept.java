package NEW2025;

import com.org.selflearning.entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryEachDept {
    public static void main(String[] args) {
        // It is showing highest salary of employee as each department


//        Map<String, Optional<Employee>> topSalaries = employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getDept,
//                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
//                ));
//
//        topSalaries.forEach((dept, empOpt) ->
//                System.out.println(dept + " -> " + empOpt.orElse(null)));
    }
}
