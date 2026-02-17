package New2026.Questions;

public class MissingNoInArray {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;  // because one number is missing

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        System.out.println("Missing Number: " + findMissing(arr));
    }
}
