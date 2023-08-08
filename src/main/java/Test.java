import java.util.*;


public class Test {
    static int count = 0;

    public static List<String> getMiddle(String str,int count ) {
          if(count%2==0){
              System.out.println("String Is Even");

              for(int i = 0; i < str.length(); i++) {
                    str.charAt(i);
                  System.out.println(  str.charAt(i));
              }

          }else{
              System.out.println("String Is Odd");
          }


        return null;
    }
    public static int findLengthofString(String str){
        for(int i = 0; i < str.length(); i++) {
                count++;
        }

        return count;
    }
    public static void main(String[] args) {
        String str ="Hellos";
        Test.findLengthofString(str);
        Test.getMiddle(str,count);




    }
}
