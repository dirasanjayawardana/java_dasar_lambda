package dirapp.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {

        // Optional class --> digunakan sebagai wraper untuk value yang bisa bernilai null
        // agar terhindar dari NullPointerException

        sayHello("Dira");

        String name = null;

        sayHello(name);
    }

    public static void sayHello(String name) {
        // menggunakan semua perintah sekaligus
        // Optional.ofNullable(name)
        // .map(value -> value.toUpperCase())
        // .ifPresentOrElse(
        //     value -> System.out.println("HELLO " + value),
        //     () -> System.out.println("HELLO")
        // );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + upperName);

        // cara 1 menggunakan Optional
        // Optional<String> optionalName = Optional.ofNullable(name);
        // Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        // optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));

        // menggunakan check null manual
        // if(name != null){
        //     String upperName = name.toUpperCase();
        //     System.out.println("HELLO " + upperName);
        // }

    }
}
