package NEW2025;

public class EmployeeSalary {
    private String name;
    private int age;
    private double salary;
    private String department;

    // Constructor
    public EmployeeSalary(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // Proper Getter methods (these are essential)
    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}


