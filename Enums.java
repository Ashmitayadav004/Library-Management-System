public class Enums {
    public enum day {
        Monday(true),
        Tuesday(true),
        Wednesday(true),
        Thursday(true),
        Friday(true),
        Saturday(false),
        Sunday(false);

        private final boolean isWeekday;

         day(boolean isWeekday) {
            this.isWeekday = isWeekday;
        }

        public String getType(){
            return isWeekday?"Weekday":"Weekend";
        }

    }

    public static void main(String[] args) {
        for (day d1 : day.values()) {
        System.out.printf("%s : %s \n",d1,d1.getType());
        }
    }

}
