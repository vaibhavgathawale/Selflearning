package NEW2024;

import java.util.ArrayList;
import java.util.List;

public class PairOfTwoNumbersSum {
    public static void main(String[] args) {

        int[] input = {1, 5, -5, 1, 8, 1, 3, 2, 4, 6, -4};

        // List to store pairs whose sum is 6
        List<int[]> pairsList = new ArrayList<>();

        // Iterate through the array and check the sum of consecutive numbers
        for (int i = 0; i < input.length - 1; i++) {
            int sum = input[i] + input[i + 1];

            // If the sum is 6, add the pair to the list
            if (sum == 6) {
                pairsList.add(new int[]{input[i], input[i + 1]});
            }
        }

        // Print the result
        System.out.println("Pairs with sum of 6:");
        for (int[] pair : pairsList) {
            System.out.println(pair[0] + ", " + pair[1]);
        }

    }
}
