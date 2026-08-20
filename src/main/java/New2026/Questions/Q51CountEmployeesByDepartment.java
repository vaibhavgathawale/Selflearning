package New2026.Questions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q51CountEmployeesByDepartment {
    public static void main(String[] args) {
        // प्रत्येक Department मध्ये किती employees आहेत ते count करा.
        List<Employee> employees = EmployeeData.getEmployees();

       Map<String,Long> result1 =  employees.stream().map(x -> x.getDepartment())
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                    System.out.println(result1);

        System.out.println("============================== Second Way =======================================>");

        Map<String, Long> result2 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));
        System.out.println(result2);


    }
}
