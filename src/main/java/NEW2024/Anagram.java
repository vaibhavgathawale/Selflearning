package NEW2024;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 ="World";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()==str2.length()){
            //converting string to chararray
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            //sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1,charArray2);
            if(result){
                System.out.println("String is anagram");
            }else{
                System.out.println("String is not anagram");
            }

        }else {
            System.out.println("String is not anagram");
        }
    }

}
