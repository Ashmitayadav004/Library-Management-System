package Traffic;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red = new TrafficLight(TrafficColor.RED);
        TrafficLight yellow = new TrafficLight(TrafficColor.YELLOW);
        TrafficLight green = new TrafficLight(TrafficColor.GREEN);

        green.start();
        green.join();
        red.start();
        red.join();
        yellow.start();
        yellow.join();

    }
}
