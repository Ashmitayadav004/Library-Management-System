package Interface;

public class Eagle extends Bird {
//Parent constructor must call using super keyword
    Eagle(int legs) {
        super(legs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly high in the sky .");
    }

}
