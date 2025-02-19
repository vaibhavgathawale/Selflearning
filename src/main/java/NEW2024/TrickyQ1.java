package NEW2024;

public class TrickyQ1 {
    public static void main(String[] args) {

        // What is O/P of this prog? Why ?
        //Ans: str will be store into string literals in stack area also the str1 reside in same memory address
        // but str1 concadination str so it will be pickup at a runtime, so that's why is showing false.

        String str = "Test";
        String str1 = str + "Test1";

        System.out.println("Hash Code 0 "+str.hashCode());

        System.out.println("Hash Code 1 "+str1.hashCode());

        String str2 = "TestTest1";
        System.out.println("Hash Code 2 "+str2.hashCode());

        if(str1==str2)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
