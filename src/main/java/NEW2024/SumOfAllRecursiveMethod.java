package NEW2024;

public class SumOfAllRecursiveMethod {
    // Recursive function to find the sum of digits of a number
    public static int sumOfDigits(int number) {
        // Base case: If the number is 0, return 0
        if (number == 0) {
            return 0;
        }
        // Recursive case: Sum the last digit and recursively call with the remaining digits
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        int number1 = 47862;
        int result1 = sumOfDigits(number1);
        System.out.println("Sum of all digits in " + number1 + " = " + result1);
    }
}
