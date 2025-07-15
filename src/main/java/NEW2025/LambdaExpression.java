package NEW2025;

public class LambdaExpression {


     interface MyFunction {
        int apply(int a, int b);
    }
    public static void main(String[] args) {

        MyFunction add = (x,y) -> x+y;
        int result = add.apply(5,2);
        System.out.println(result);
    }
}
