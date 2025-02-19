package NEW2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingElementFromNull {
    static class Person{

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("z");
        Person p1 = null;
        Person p2 = new Person();
        p2.setName("a");
        Person p3 = new Person();
        p3.setName("b");
        Person p4 = null;
        Person p5 = new Person();

        List<Person> personList = Arrays.asList(p,p1,p2,p3,p4,p5);


// Sorting the list with nulls first, then sorting by name in ascending order
        List<Person> sortedList = personList.stream()
                .sorted(Comparator.nullsFirst(Comparator.comparing(person -> person.getName(), Comparator.nullsFirst(String::compareTo))))
                .collect(Collectors.toList());

        // Print the sorted list
        sortedList.forEach(person -> System.out.println(person == null ? "null" : person.getName()));


    }

}


