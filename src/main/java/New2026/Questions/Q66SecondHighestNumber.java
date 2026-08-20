package New2026.Questions;

import java.util.Arrays;
import java.util.Comparator;

public class Q66SecondHighestNumber {
    public static void main(String[] args) {
        // Array मधून second highest number शोधा. Sorting वापरू नका.

        int arr[] = {10, 25, 8, 40, 30};

        int secondHighest = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest);
    }
}
