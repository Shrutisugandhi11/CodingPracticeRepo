package org.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadCallable implements Callable<Integer> {
    int sum=0;
    int task=1;
    @Override
    public Integer call() throws Exception {
        for (int i=0;i<4;i++)
            sum+=i;
        TimeUnit.SECONDS.sleep(1);

        return sum;
    }
    public ThreadCallable(int task){
        this.task=task;
    }
}
