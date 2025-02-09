package Overloading;

public class Calculator {
    private int first, second, third;
    private double fir, sec;
    

   
    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public double getFir() {
        return fir;
    }

    public double getSec() {
        return sec;
    }

    public double add(int first, int second) {
        return first + second;
    }

    public double add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double fir, double sec) {
        return fir + sec;
    }

}
