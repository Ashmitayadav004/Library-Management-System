public class Dice {
    int roll() {
        double random = Math.random()*6;
        int roll = (int) (Math.ceil(random));
        return roll;
    }

    public static void main(String[] args) {
        Dice d1 = new Dice();
        System.out.println(d1.roll());
        System.out.println(Math.random());
    }
}