import java.util.Scanner;

public class Task1 {
    int number;

    int isEven (int consumerNumber) {
        this.number = consumerNumber;
        return consumerNumber % 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int consumerNumber = scanner.nextInt();

        Task1 task1 = new Task1();

        if (task1.isEven(consumerNumber) == 1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
