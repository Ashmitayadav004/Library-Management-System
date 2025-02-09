import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Maps {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("Usa", "Washington");
        countryMap.put("China", "Beijing");
        countryMap.put("Srilanka", "Columbo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please entry the country name");
        String country = sc.nextLine();
        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));

        } else {
            System.out.println("Sorry");
        }

    }

}
