package Threading;

public class ThreadJoin extends Thread {
    private final int threadNumber;

    public ThreadJoin(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.printf("%s Thread Starting -%d \n", Thread.currentThread().getName(), threadNumber);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.printf("%s Thread ending -%d\n", Thread.currentThread().getName(), threadNumber);
    }

}
