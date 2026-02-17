package New2026.TrickyQuestions;


// O/P: 10
public class Q1 {

    // System.out.println(val); main method static आहे, त्यामुळे direct val access करू शकत नाही.
   //तर compile-time error आला असता कारण: Non-static variable cannot be referenced from a static context.

    int val  = 10;

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        System.out.println(q1.val);
    }
}
