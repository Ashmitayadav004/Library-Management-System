package Traffic;

public class TrafficLight extends Thread {

    private final TrafficColor color;

    public TrafficLight(TrafficColor color) {
        this.color = color;
    }

    public TrafficColor getColor() {
        return color;
    }

    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s Color is inactive\n", color);
    }

}
