package NEW2025;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {

        String str1 ="ABCA";
        String str2 ="ABAC";
        // Converting to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Checking length of string
        if(str1.length()==str2.length()){
            // Converting to Char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            // Sorting of an Array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1,charArray2);

            if(result){
                System.out.println("String is Anagram");
            }else {
                System.out.println("Not Anagram");
            }

        }else {
            System.out.println("Not Anagram");
        }

    }
}
