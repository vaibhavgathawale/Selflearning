package MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

       java.util.concurrent.ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(() ->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();

        CompletableFuture completableFuture = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenApply(x -> x + " World");
        System.out.println(completableFuture.get());
    }
}
