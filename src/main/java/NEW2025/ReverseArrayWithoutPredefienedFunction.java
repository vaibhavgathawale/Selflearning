package NEW2025;

import java.util.Arrays;

public class ReverseArrayWithoutPredefienedFunction {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            //swip elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //move towards the middle
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr)); // output: [5, 4, 3, 2, 1]


    }
}
