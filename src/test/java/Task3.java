import java.util.Scanner;

public class Task3 {
    double length;
    double width;

    double calculateArea () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first length: ");
        double consumerLength = scanner.nextDouble();

        System.out.println("Enter first width: ");
        double consumeWidth = scanner.nextDouble();
        return consumerLength * consumeWidth;

    }

    double calculateArea (double consumerLength, double consumeWidth) {
        this.length = consumerLength;
        this.width = consumeWidth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first length: ");
        consumerLength = scanner.nextDouble();

        System.out.println("Enter first width: ");
        consumeWidth = scanner.nextDouble();

        return consumerLength * consumeWidth;

    }


    public static void main(String[] args) {
        Task3 task3 = new Task3();

        System.out.println("Area of rectangle is: " + task3.calculateArea());
        System.out.println("Area of rectangle is: " + task3.calculateArea(task3.length, task3.width));

    }

}
