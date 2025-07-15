package NEW2025;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachElementCountArray {
    public static void main(String[] args) {

        int arr []  = {50, 40, 56, 5, 80, 65, 45, 10, 10};

        Map<Integer,Long> result = Arrays.stream(arr).boxed().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        result.forEach((key,value)-> System.out.println("Key "+key+" Value "+value));

    }
}
