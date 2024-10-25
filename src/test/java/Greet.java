import java.util.Scanner;

public class Greet {
    //                                                          #1
    void Greet() {
        System.out.println("Hello");
    }

    void Greet(String name) {

        System.out.println("Hello " + name);
    }

//                                                          #2
//    void Greet() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Greet in your language: ");
//        String greet = scanner.next();
//        System.out.println(greet);
//    }
//
//
//    void Greet(String name) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        name = scanner.next();
//        System.out.println("Hello " + name);
//    }


//                                                           #3
//    public String Greet() {
//        return "Hello";
//    }
//
//    public String Greet(String name) {
//       return "Hello " + name;
//    }



//    public String Greet() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Greet in your language: ");
//        return scanner.next();
//    }
//
//    public String Greet(String name) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        name = scanner.next();
//       return "Hello " + name;
//    }


    public static void main(String[] args) {
        Greet greet = new Greet();;

//                           #1
        greet.Greet();
        greet.Greet("Alice");

//                           #2
//        greet.Greet();
//        greet.Greet("");


//                           #3
//        System.out.println(greet.Greet());
//        System.out.println(greet.Greet("Alice"));

//                           #4
//        System.out.println(greet.Greet());
//        System.out.println(greet.Greet(""));

    }
}
