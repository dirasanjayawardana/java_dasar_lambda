package dirapp.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {

        // Lazy parameter --> hanya akan dieksekusi ketika parameternya diakses
        // Di java pada dasarnya tidak mendukung fitur parameter lazy, namun dengan lambda bisa membuat parameter layaknya lazy parameter

        testScore(60, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        } else {
            System.out.println("Coba Lagi Tahun Depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Dira";
    }
}
