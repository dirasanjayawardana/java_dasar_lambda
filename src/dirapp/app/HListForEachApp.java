package dirapp.app;

import java.util.List;
import java.util.function.Consumer;

public class HListForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Dira", "Sanjaya", "Wardana");

        // menggunakan for loop
        for (var value : list) {
            System.out.println(value);
        }

        // menggunakan forEach anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // menggunakan lambda
        list.forEach(value -> System.out.println(value));

        // menggunakan lambda method reference
        list.forEach(System.out::println);
    }
}
