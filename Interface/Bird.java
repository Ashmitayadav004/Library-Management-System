package Interface;

public abstract class Bird implements Flyable {
    private int legs;

    Bird(int legs) {
        this.legs = legs;
    }

    public int getlegs() {
        return legs;
    }
}
