package NEW2025;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOccuranceIntigerArray {
    public static void main(String[] args) {

        int arr[]={1,6,5,4,3,2,1};

        Map<Integer,Long>result= IntStream.of(arr).boxed().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result);


    }
}
