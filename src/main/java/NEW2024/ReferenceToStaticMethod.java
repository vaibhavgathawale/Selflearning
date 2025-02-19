package NEW2024;

public class ReferenceToStaticMethod {

     @FunctionalInterface
    interface Color{
         void say();
    }

    public static void carColor(){
        System.out.println("Red Colour Car and Hello, this is static method.");
    }
    public static void main(String[] args) {
        // Referring static method
        Color colour = ReferenceToStaticMethod::carColor;
        // Calling interface method
        colour.say();
    }
}
