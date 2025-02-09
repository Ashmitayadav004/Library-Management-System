package MultiThread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws ExecutionException {
         List<Future<Integer>> list = new ArrayList<>();
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            int i;
            for ( i = 0; i < 10; i++) {
                Factorial f1 = new Factorial(i);
                // service.submit(f1);
                list.add(service.submit(f1));
            }
            for (Future<Integer> future : list) {
                System.out.printf("\n Result is : %d", future.get());
            }
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Overr");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
