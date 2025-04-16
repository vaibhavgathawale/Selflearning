package practice;


public class Singleton {

    // Creating private as instance object
    private static final Singleton instance = new Singleton();
   // create private constructor
    private Singleton(){
    }
    //Method to get this instance
    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton ss= new Singleton();
        String s1 = String.valueOf(ss.getInstance().hashCode());
        System.out.println(s1);


    }
}
