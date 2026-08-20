package New2026.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseByLenthDesending {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Ravi", "Krishna", "Sai", "Prakash", "Ram");

        names.stream()
                 // Sort by length in descending order
                .sorted(Comparator.comparingInt(String::length).reversed())
                // Reverse each name
                .map(name -> new StringBuilder(name).reverse().toString())
                // Print
                .forEach(System.out::println);
    }
}
