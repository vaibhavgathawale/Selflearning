package NEW2025;

import java.util.Arrays;

public class StartWIthArray {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,35};

        Arrays.stream(arr).boxed().filter(num -> String.valueOf(num).startsWith("3"))
                .forEach(System.out::println);

    }
}
