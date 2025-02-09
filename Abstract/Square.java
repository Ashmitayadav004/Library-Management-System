package Abstract;

public class Square {
    private int side;

    Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double calculateArea() {
        return side * side;
    }

}
