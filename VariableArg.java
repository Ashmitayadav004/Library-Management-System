public class VariableArg {
    public static void main(String[] args) {
        System.out.print("MY name");
        System.out.print("is Ashmita ");
        System.out.print("Yadav");
        System.out.print("Heheheheheeeeeee");
        System.out.print("Wowwwwwwwwwwwwww");
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append("   ");
        }
        return sb.toString();
    }
}
