package ThreadService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Executes e1 = new Executes();
        service.submit(e1);
        service.shutdownNow();
    }
}
