package MultiThreading;

public class EvenandOddNumerPrint {
    // This programe is demostrate two threads are executing, firstly printing odd numbers and then even numbers.

    private int count = 0; // shared number
    private final int MAX = 10;

    public void printEven() {
        synchronized (this) {
            while (count < MAX) {
                if (count % 2 != 0) { // not even
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println("Even: " + count);
                    count++;
                    notify(); // wake up odd thread
                }
            }
        }
    }

    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                if (count % 2 == 0) { // not odd
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println("Odd: " + count);
                    count++;
                    notify(); // wake up even thread
                }
            }
        }
    }


    public static void main(String[] args) {
        // Create two threads
        EvenandOddNumerPrint evenandOddNumerPrint = new EvenandOddNumerPrint();
        Thread oddThread = new Thread(evenandOddNumerPrint::printEven);
        Thread evenThread = new Thread(evenandOddNumerPrint::printOdd);

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}
