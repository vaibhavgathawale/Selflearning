package Java8Practice;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeated {
    public static void main(String[] args) {

        String input = "Java Articles are Awesome";
        Character  result = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) //Converting String to charset
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
    }
}
