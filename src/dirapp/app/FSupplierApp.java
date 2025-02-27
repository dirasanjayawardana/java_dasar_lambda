package dirapp.app;

import java.util.function.Supplier;

public class FSupplierApp {
    public static void main(String[] args) {
        
        // Supplier<TipeReturn> --> functional interface yang tidak menerima parameter tetapi mengembalikan data dari return methodnya

        // Tanpa menggunakan Lambda, menggunakan Anonymous Class
        Supplier<String> supplier1 = new Supplier<String>() {
            @Override
            public String get() {
                return "Dira Sanjaya Wardana1";
            }
        };
        String name1 = supplier1.get();
        System.out.println(name1);

        // Menggunakan Lambda
        Supplier<String> supplier = () -> "Dira Sanjaya Wardana";
        String name = supplier.get();
        System.out.println(name);
    }
}
