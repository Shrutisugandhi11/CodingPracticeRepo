package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThread {
    public static void main(String[] args) {
        Runnable task1=()->{
            for (int i=0;i<10;i++)
                System.out.println("task1..."+i);
        };
        Runnable task2=()->{
            for (int i=0;i<10;i++)
                System.out.println("task2..."+i);
        };
        Runnable task3=()->{
            for (int i=0;i<10;i++)
                System.out.println("task3..."+i);
        };
        Runnable task4=()->{
            for (int i=0;i<10;i++)
                System.out.println("task4..."+i);
        };
        Runnable task5=()->{
            for (int i=0;i<10;i++)
                System.out.println("task5..."+i);
        };
        Runnable task6=()->{
            for (int i=0;i<10;i++)
                System.out.println("task6..."+i);
        };
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);
        executorService.submit(task6);
        executorService.shutdown();

    }
}
