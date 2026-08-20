package New2026.Questions;

import java.util.List;

public class Q37CountEmployeesInITDepartment {
    public static void main(String[] args) {
        // IT department मध्ये एकूण किती employees आहेत ते count करा.
        List<Employee> employees = EmployeeData.getEmployees();

       Long iTEmp =  employees.stream().filter(x -> x.getDepartment().equals("IT")).count();
        System.out.println(iTEmp);
    }
}
