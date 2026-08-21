package New2026.Questions;

import java.util.Arrays;

public class EvenOddCount {
    public static void main(String[] args) {
        //// we have list of intigers and need to find cout even and odd numbers using java 8.

        int arr[] = {10,21,30,40,55,31};

        Long even = Arrays.stream(arr).filter(x -> x%2==0).count();

        Long odd = Arrays.stream(arr).filter(x -> x%2 !=0).count();

        System.out.println(even);
        System.out.println(odd);
    }
}
