package functional;
@FunctionalInterface
public interface Test {
    void empName();

    default void empAddress() {
        System.out.println("Emp Address from Function interface");
    }
    public default void getEMPSAL(){

    }
}
