package NEW2025;

public class Emp {

    private int id;
    private String department;
    private String name;
    private double salary;
    private int experience;

    public Emp(int id, String department, String name,
                    double salary, int experience) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary + " " + experience + " ";
    }
}
