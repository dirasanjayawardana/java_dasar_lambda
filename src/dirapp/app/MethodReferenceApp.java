package dirapp.app;

import java.util.function.Function;
import java.util.function.Predicate;

import dirapp.util.StringUtil;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // ketika hanya ingin mengakses method yang ada di parameter lambda, bisa gunakan method reference, dengan catatan parameter method harus sama dengan parameter di Lambda

        // Tanpa method reference
        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);

        // Menggunakan method reference
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("dira"));
        System.out.println(predicateIsLowerCase.test("diRa"));


        // Method Reference di Parameter
        // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Dira"));
    }

    public void run() {
        // menggunakan method reference ketika mengakses method yg bukan static pada object yg sama
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("dira"));
        System.out.println(predicateIsLowerCase.test("diRa"));
    }

    public void run2() {
        // menggunakan method reference ketika mengakses method yg bukan static pada object yang berbeda
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("dira"));
        System.out.println(predicateIsLowerCase.test("diRa"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
