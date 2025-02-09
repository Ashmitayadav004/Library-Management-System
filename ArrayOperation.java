public class ArrayOperation {
    private int[] array;
    

       public ArrayOperation(int[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        ArrayOperation arr1 = new ArrayOperation(new int[]{1,3,5,7,9});
        ArrayOperation.Statistucs s1 = arr1.new Statistucs();
        System.out.println(s1.mean());
    }

    public class Statistucs {
        public int mean() {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum/array.length;
        }

        public int median() {

            return 0;
        }
    }
}
