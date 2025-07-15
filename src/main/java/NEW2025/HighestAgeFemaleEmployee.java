package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAgeFemaleEmployee {

    /*This programme demostrating filters*/
    String name;
    String gender;
    int age;

    public HighestAgeFemaleEmployee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "HighestSalaryOfFemaleEmployee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        List<HighestAgeFemaleEmployee> employees = Arrays.asList(
                new HighestAgeFemaleEmployee("Roshani",22,"FEMALE"),
                new HighestAgeFemaleEmployee("Shilpa",25,"FEMALE"),
                new HighestAgeFemaleEmployee("Rohan",30,"MALE"),
                new HighestAgeFemaleEmployee("DAS",25,"Male"),
                new HighestAgeFemaleEmployee("Shreya",35,"Female"),
                new HighestAgeFemaleEmployee("Rohini",35,"Female"));


        List<HighestAgeFemaleEmployee> result = employees.stream()
                .filter(a -> a.getAge()>25)
                .filter(x -> x.getName().toLowerCase().startsWith("r"))
                .filter(p -> p.getGender().toLowerCase().startsWith("female"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

    }
}
