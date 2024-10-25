import java.util.Scanner;

public class Task5 {
    double Fahrenheit;

    double convertToCelsius () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degree in Fahrenheit" );
        Fahrenheit = scanner.nextDouble();
        return (double) 5 /9 * (Fahrenheit - 32);
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();

        System.out.println(task5.convertToCelsius());
    }
}
