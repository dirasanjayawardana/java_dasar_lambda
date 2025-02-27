package dirapp.app;

import java.util.function.Function;

public class CFunctionApp {
    public static void main(String[] args) {
        
        // Function<TipeParameter, TipeReturn> --> functional interface yang menerima parameter dan mengembalikan data dari methodnya

        // Tanpa menggunakan Lambda, menggunakan Anonymous Class
        Function<String, Integer> function1 = new Function<String,Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };
        Integer length1 = function1.apply("Dira Sanjaya1");
        System.out.println(length1);

        // Menggunakan Lambda
        Function<String, Integer> function2 = value -> value.length();
        Integer length2 = function2.apply("Dira Sanjaya2");
        System.out.println(length2);
    }
}
