package dirapp.app;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Dira", "Sanjaya", "Wardana"));

        // menggunakan for loop (tidak bisa remove isi list dengan perulangan)
        // for (var name : names) {
        //     if (name.length() > 5) {
        //         names.remove(name);
        //     }
        // }

        // menggunakan remove if anonymous class
        // names.removeIf(new Predicate<String>() {
        //     @Override
        //     public boolean test(String value) {
        //         return value.length() > 5;
        //     }
        // });

        // menggunakan lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);

    }
}
