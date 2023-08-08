@java.lang.FunctionalInterface
public interface FunctionalInterface {

    void disp();

    default String getName(){
        return "Hello World";
    }

}
