package org.example;

import java.util.concurrent.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        for (int i = 1; i <= 3; i++) {
//           executorService.execute();
//           executorService.submit()
//
//        }

        for (int i = 1; i <= 3; i++) {
            Future<Integer>future= executorService.submit(new ThreadCallable(i));
            System.out.println( future.get());
        }


        executorService.shutdown();



//        TimeUnit.SECONDS.sleep(5);
//        executorService.submit(new ThreadRunnable(1));
//        executorService.submit(new ThreadRunnable(2));
//        executorService.submit(new ThreadRunnable(3));
//        executorService.submit(new ThreadRunnable(4));
//        executorService.submit(new ThreadRunnable(5));
//        executorService.submit(new ThreadRunnable(6));


    }
}
/* cached pool example:
*       executorService.shutdown();
        executorService.submit(new ThreadRunnable(1));
        executorService.submit(new ThreadRunnable(2));
        executorService.submit(new ThreadRunnable(3));
        TimeUnit.SECONDS.sleep(5);
        executorService.submit(new ThreadRunnable(4));
        executorService.submit(new ThreadRunnable(5));
        executorService.submit(new ThreadRunnable(6));*/

/*callable task
 for (int i = 1; i <= 3; i++) {
          Future<Integer>future= executorService.submit(new ThreadCallable(i));
            System.out.println( future.get());
        }
 */
