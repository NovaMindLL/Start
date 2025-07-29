package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        /*
         * CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hi");
         * String result = future.join();
         * System.out.println(result);
         */
        /*
         * CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hi",
         * Executors.newCachedThreadPool());
         * String result = future.join();
         * System.out.println(result);
         */
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> System.out.println("Hi"),
                Executors.newCachedThreadPool());
    }
}
