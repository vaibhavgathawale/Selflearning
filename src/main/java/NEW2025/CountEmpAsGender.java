package NEW2025;

import com.org.selflearning.entity.Department;
import com.org.selflearning.entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmpAsGender {
    public static void main(String[] args) {


        // This prog demostrate count of each emp in each deprt as Male and Female.

        // Sample Data
//        List<Department> departments = Arrays.asList(
//                new Department("IT", Arrays.asList(
//                        new Employee("Alice", "Female"),
//                        new Employee("Bob", "Male"),
//                        new Employee("Charlie", "Male")
//                )),
//                new Department("HR", Arrays.asList(
//                        new Employee("Diana", "Female"),
//                        new Employee("Eve", "Female"),
//                        new Employee("Frank", "Male")
//                ))
//        );
//
//        // Count Male and Female
//        Map<String, Long> genderCount = departments.stream()
//                .flatMap(dept -> dept.getEmployees().stream())
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//
//        // Output
//        System.out.println("Gender Count: " + genderCount);
    }
}
