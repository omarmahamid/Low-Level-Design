package com.cache;

import java.util.concurrent.CompletableFuture;

public class Main{

    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> computeResult())
                .thenApply(result -> processResult(result))
                .thenAccept(finalResult -> System.out.println(finalResult));

        System.out.println("Hello after the future !!!");

        try {
            future.get();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static String computeResult() {
        // Perform some time-consuming computation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Result";
    }

    private static String processResult(String result) {
        return "Processed " + result;
    }


}
