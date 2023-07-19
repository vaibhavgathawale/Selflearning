package Java8Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortingByStreamAPI {
    public static void main(String[] args) {

        // Using 1 way
        List li = new ArrayList<>();
        li.add(50);
        li.add(10);
        li.add(40);
        li.add(30);
        List<Integer>list = (List<Integer>) li.stream().sorted().collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("_________________________1__________________________");

        // Using 2 way
        List<Integer> sortedList1 = list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        sortedList1.forEach(System.out::println);
        System.out.println("_________________________2__________________________");

        // Using 3 way
        List<Integer> sortedList2 = list.stream()
                .sorted((o1,o2)-> o1.compareTo(o2))
                .collect(Collectors.toList());
        sortedList2.forEach(System.out::println);



    }
}
