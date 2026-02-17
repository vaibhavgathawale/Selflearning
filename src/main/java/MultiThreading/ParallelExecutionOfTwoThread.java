package MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ParallelExecutionOfTwoThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Task 1
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Executing Task 1 in thread: " + Thread.currentThread().getName());
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return "Result from Task 1";
        });

        // Task 2
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Executing Task 2 in thread: " + Thread.currentThread().getName());
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return "Result from Task 2";
        });

        // Combine results when both complete
        CompletableFuture<String> combined = task1.thenCombine(task2, (result1, result2) -> {
            return result1 + " + " + result2;
        });

        // Get final result
        String finalResult = combined.get();
        System.out.println("Final Combined Result: " + finalResult);
    }
}
