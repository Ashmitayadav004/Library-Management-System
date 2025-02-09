public class StrArray {
    public static void main(String[] args) {
        String[] arr = new String[] { "I am loving someone ", " as he is my new crush", "which is nothing but a muesli",
                " which i eat daily .", " Heeehehehehheehh", "oving you also try the same ." };
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
