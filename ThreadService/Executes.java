package ThreadService;

public class Executes implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\n", i + 1);
        }
    }

}
