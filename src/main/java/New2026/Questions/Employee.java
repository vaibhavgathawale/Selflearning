package New2026.Questions;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private String gender;
    private double salary;
    private String address;
    private String department;
    private int age;
    private int experience;
    private boolean active;

    public Employee(String name, String gender, double salary, String address, String department, int age, int experience, boolean active) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.address = address;
        this.department = department;
        this.age = age;
        this.experience = experience;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", active=" + active +
                '}';
    }



}
