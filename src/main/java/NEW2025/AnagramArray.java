package NEW2025;

import java.util.Arrays;

public class AnagramArray {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 4, 3, 1, 2,};

        if (arr1.length == arr2.length) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean result = Arrays.equals(arr1, arr2);
            if (result) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
    }
}
