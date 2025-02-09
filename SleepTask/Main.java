package SleepTask;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            ThreadSleep sleep = new ThreadSleep();
            service.submit(sleep);
          
        }
        service.shutdown();
       
        try {
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
           System.out.println("Errror");
           service.shutdown();
        }
    }
}
