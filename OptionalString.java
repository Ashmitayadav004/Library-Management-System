import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOptional(null));
        System.out.println(toOptional("Ashmita"));
        System.out.println(toOptional("Pop"));
        System.out.println(toOptional(" "));

    }

    public static Optional<String> toOptional(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
