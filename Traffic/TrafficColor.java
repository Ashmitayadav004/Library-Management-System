package Traffic;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int time;

    private TrafficColor(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

}
