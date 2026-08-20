package New2026.Questions;

import java.util.List;

public class Q23FindITOrFinanceEmployees {
    public static void main(String[] args) {
        //  IT किंवा Finance department मधील employees शोधा.

        List<Employee> employees = EmployeeData.getEmployees();

        employees.stream().filter(x -> x.getDepartment().equals("IT")|| x.getDepartment().equals("Finance"))
                .forEach(System.out::println);
    }
}
