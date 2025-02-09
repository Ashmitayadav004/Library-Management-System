public class Threads extends Thread {

    private final int noOfThread;

    public Threads(int noOfThread) {
        this.noOfThread = noOfThread;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello from Thread-%d \n", noOfThread);
        }
    }

    public static void main(String[] args) {
        Threads t1 = new Threads(1);
        Threads t2 = new Threads(2);

        // t1.run();
        // t2.run();
        t1.start();
        t2.start();

    }

}
