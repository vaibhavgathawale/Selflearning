package MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SecquenalRuningThreadAfterFInishFirst {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        // First CompletableFuture (Task 1)
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Executing Task 1 in thread: " + Thread.currentThread().getName());
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return "Result from Task 1";
        });

        // Sequentially run Task 2 after Task 1 completes
        CompletableFuture<String> combined = task1.thenCompose(result1 -> {
            return CompletableFuture.supplyAsync(() -> {
                System.out.println("Executing Task 2 in thread: " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                return result1 + " + Result from Task 2";
            });
        });

        // Get the combined result
        String finalResult = combined.get();
        System.out.println("Final Combined Result: " + finalResult);


    }
}
