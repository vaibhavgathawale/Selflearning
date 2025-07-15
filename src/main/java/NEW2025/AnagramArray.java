package NEW2025;

import java.util.Arrays;

public class AnagramArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,4,3,1,2,};

        if(isAnagram(arr1,arr2)){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
    public static boolean isAnagram(int A[],int B[]){
        if(A.length!=B.length){
            return false;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A,B);

    }





}
