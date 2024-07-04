package dirapp.app;

import dirapp.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // menggunakan anonymous class tanpa menggunakan lambda
        // SimpleAction simpleAction1 = new SimpleAction() {
        //     @Override
        //     public String action() {
        //         return "Dira1";
        //     }
        // };
        // System.out.println(simpleAction1.action());

        // menggunakan Lambda
        // SimpleAction simpleAction2 = () -> {
        //     return "Dira2";
        // };
        // System.out.println(simpleAction2.action());


        // menggunakan anonymous class tanpa menggunakan lambda
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String value) {
                return "Hello " + value;
            }
        };
        System.out.println(simpleAction1.action("Dira1"));


        // menggunakan Lambda
        SimpleAction simpleAction2 = (String value) -> {
            return "Hello " + value;
        };
        System.out.println(simpleAction2.action("Dira2"));


        // membuat Lambda tanpa menyebutkan tipe data di parameternya karena otomatis
        SimpleAction simpleAction3 = (value) -> {
            return "Hello " + value;
        };
        System.out.println(simpleAction3.action("Dira3"));
        
        
        // membuat Lambda tanpa blok karena hanya return satu baris
        SimpleAction simpleAction4 = (String value) -> "Hello " + value;

        SimpleAction simpleAction5 = (value) -> "Hello " + value;

        SimpleAction simpleAction6 = value -> "Hello " + value;

        System.out.println(simpleAction4.action("Dira4"));
    }
}
