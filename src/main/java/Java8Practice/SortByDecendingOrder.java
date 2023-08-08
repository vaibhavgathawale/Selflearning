package Java8Practice;

import java.util.Arrays;

public class SortByDecendingOrder {


    public static void main(String[] args) {


        int arr[] = {4, 10, 7, 5};
        System.out.printf("1. Input array : %s ", Arrays.toString(arr));
        replaceElements(arr);

}

    private static void replaceElements(int[] arr) {

        int lastIndex = arr.length - 1;
        int maxElement = arr[lastIndex];
        arr[lastIndex--] = -1;

        while (lastIndex >= 0) {
            int current = arr[lastIndex];
            arr[lastIndex] = maxElement;
            if (current > maxElement) {
                maxElement = current;
            }
            lastIndex--;
        }
        System.out.printf("\nElements replaced by greatest: %s",Arrays.toString(arr));
    }
    }
