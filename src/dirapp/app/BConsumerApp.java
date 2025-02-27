package dirapp.app;

import java.util.function.Consumer;

public class BConsumerApp {
    public static void main(String[] args) {
        
        // Consumer<TipeParameter> --> functional interface yang menerima parameter dan return methodnya void, contoh untuk forEach

        // Tanpa menggunakan Lambda, menggunakan Anonymous Class
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String value) {
               System.out.println(value);
            }
        };
        consumer1.accept("Dira Sanjaya1");

        // Menggunakan Lambda
        Consumer<String> consumer2 = value -> System.out.println(value);
        consumer2.accept("Dira Sanjaya2");
    }
}
