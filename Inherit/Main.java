package Inherit;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        TwoWheeler t1 = new TwoWheeler();
        Car c1 = new Car();
        
        v1.fuel();
        
        t1.Start();
        t1.fuel();
        
        c1.Stop();
        c1.Start();
        c1.fuel();
    }
}
