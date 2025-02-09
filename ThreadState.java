public class ThreadState extends Thread {
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println(getState());
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        ThreadState t1 = new ThreadState();
        System.out.println(t1.getState());
        t1.start();
        t1.join();
        System.out.println(t1.getState());

    }
}
