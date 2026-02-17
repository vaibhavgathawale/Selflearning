package NEW2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {

        int[] arr = {9, 2, 4, 0, 5, 0, 1, 4, 6, 8};

        // Convert int[] to List<Integer> for easier streaming
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumbers = list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
