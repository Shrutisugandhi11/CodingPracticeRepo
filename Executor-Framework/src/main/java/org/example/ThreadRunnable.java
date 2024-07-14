package org.example;

public class ThreadRunnable implements Runnable {
    int task ;

    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("task" + task + "..." + i);
        }

    }
    public ThreadRunnable(int task){
        this.task=task;
    }

}
