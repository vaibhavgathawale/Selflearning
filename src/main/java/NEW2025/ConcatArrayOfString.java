package NEW2025;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatArrayOfString {
    public static void main(String[] args) {

        // This programme will concat two string of array

        String arr1[] = {"10", "301", "2"};
        String arr2[] = {"1", "13", "101", "2"};

        String[] result = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(result));


    }
}
