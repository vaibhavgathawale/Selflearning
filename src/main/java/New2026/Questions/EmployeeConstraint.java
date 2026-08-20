package New2026.Questions;

import NEW2025.Emp;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeConstraint {

    /* Write a Java 8 program that returns a Map<String, Employee> satisfying the following conditions:

       The key should be the employee's department.

       The value should be the employee selected according to these rules:

       1.	Employee with the highest salary.

       2. If multiple employees have the same salary, select the one with greater experience.

       3.  If salary and experience are both the same, select the employee whose name comes first alphabetically.

              Constraints

        Use only Java 8 Streams and Collectors.

        Do not use explicit loops (for, while, enhanced for).

        Do not sort the entire employee list.

        The solution should traverse the data efficiently.

        Expected Output

        IT      -> Employee{id=103, name='Vikas', salary=95000, experience=4}

        HR      -> Employee{id=105, name='Anita', salary=70000, experience=6}

        Finance -> Employee{id=108, name='Akash', salary=85000, experience=5}
     */

    public static void main(String[] args) {


        List<Emp> employees = Arrays.asList(
                new Emp(101, "IT", "Rahul", 90000, 5),
                new Emp(102, "IT", "Amit", 90000, 7),
                new Emp(103, "IT", "Vikas", 95000, 4),
                new Emp(104, "HR", "Neha", 70000, 6),
                new Emp(105, "HR", "Anita", 70000, 6),
                new Emp(106, "HR", "Priya", 68000, 8),
                new Emp(107, "Finance", "Rohit", 85000, 5),
                new Emp(108, "Finance", "Akash", 85000, 5),
                new Emp(109, "Finance", "Karan", 82000, 7)
        );


        Comparator<Emp> comparator =
                Comparator.comparingDouble(Emp::getSalary)
                        .thenComparingInt(Emp::getExperience)
                        .thenComparing(Emp::getId);

        Map<String, Emp> result1 = employees.stream()
                .collect(Collectors.toMap(
                        Emp::getDepartment,
                        e -> e,
                        BinaryOperator.maxBy(comparator)
                ));

        result1.forEach((dept, emp) ->
                System.out.println(dept + " By First Way --------> " + emp));



        /*
           By Second Way
         */

        Map<String, Emp> result3 = employees.stream()
                .collect(Collectors.groupingBy(
                        Emp::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(comparator),
                                Optional::get
                        )
                ));

        System.out.println("Second Result --------> ! :" +result3);



        /*
           By Third Way
         */
        BinaryOperator<Emp> betterEmployee = (e1, e2) -> {

            // 1. Higher salary wins
            if (Double.compare(e1.getSalary(), e2.getSalary()) != 0) {
                return e1.getSalary() > e2.getSalary() ? e1 : e2;
            }

            // 2. Higher experience wins
            if (e1.getExperience() != e2.getExperience()) {
                return e1.getExperience() > e2.getExperience() ? e1 : e2;
            }

            // 3. Alphabetically smaller name wins
            return e1.getName().compareTo(e2.getName()) <= 0 ? e1 : e2;
        };

        Map<String, Emp> result2 = employees.stream()
                .collect(Collectors.toMap(
                        Emp::getDepartment,
                        e -> e,
                        betterEmployee
                ));

        result2.forEach((dept, emp) ->
                System.out.println(dept + " By Third Way -------------> " + emp));




    }
}
