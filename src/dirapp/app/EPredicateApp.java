package dirapp.app;

import java.util.function.Predicate;

public class EPredicateApp {
    public static void main(String[] args) {
        
        // Predicate<TipeParameter> --> functional interface yang butuh parameter dan return methodnya boolean

        // Tanpa Lambda, menggunakan Anonymous Class
        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.isBlank();
            }
        };
        boolean blank1 = predicate1.test("Dira");
        System.out.println(blank1);

        // Menggunakan Lambda
        Predicate<String> predicate2 = value -> value.isBlank();
        boolean blank2 = predicate2.test("");
        System.out.println(blank2);
    }
}
