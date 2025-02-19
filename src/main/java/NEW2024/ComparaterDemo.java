package NEW2024;

import java.util.*;

public class ComparaterDemo implements Comparator<ComparaterDemo.Person> {

    // It will use for multiple sorting also customize sorting. It will not affect orignal object.

    static class Person {
        String name;
        int age;
        double weight;

        public Person(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
        }
    }
    @Override
    public int compare(Person p1, Person p2) {

        return p1.getAge()-p2.getAge();
    }



    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 30, 65.5),
                new Person("Bob", 25, 75.0),
                new Person("Charlie", 35, 80.0)));

        System.out.println("Original people list: " + people);

        Collections.sort(people, new ComparaterDemo());
        System.out.println("Sorted people list by name: " + people);

        Collections.sort(people, new ComparaterDemo());
    }
}
