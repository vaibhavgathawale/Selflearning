package NEW2024;

import java.util.Arrays;
import java.util.List;

public class FindFirstWordInList {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Apple","Banana","Hello","Gauva","Watermalen","Hey");
        list.stream()
                .map(x -> x + "")
                .filter(x -> x.startsWith("H"))
                .forEach(System.out::println);
    }
}
