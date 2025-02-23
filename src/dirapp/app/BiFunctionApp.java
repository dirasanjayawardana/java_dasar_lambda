package dirapp.app;

import java.util.function.BiFunction;

public class BiFunctionApp {
    public static void main(String[] args) {

        // BiFunction<Parameter1, Parameter2, TipeReturn> --> functional interface yang bisa menerima beberapa parameter dan mengembalikan data dari methodnya
        
        BiFunction<Integer, String, String> function1 = (number, text) -> 
            "Angka: " + number + ", Teks: " + text + ", Panjang Teks: " + text.length();
        
        String result = function1.apply(10, "Dira Sanjaya");
        System.out.println(result);
    }
}
