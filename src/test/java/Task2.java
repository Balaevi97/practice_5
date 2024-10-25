import java.util.Scanner;

public class Task2 {
    int number1;
    int number2;
    int number3;

    int findLargest (int number1, int number2, int number3) {
        Scanner scanner = new Scanner(System.in);
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        System.out.println("Enter number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        number2 = scanner.nextInt();
        System.out.println("Enter number 3: ");
        number3 = scanner.nextInt();


        if (number1 > number2 && number1 > number3 ) {
            return number1;
        } else if (number2 > number1 && number2 > number3 ) {
            return number2;
        } else  {
            return number3;
        }

    }

//    int findLargest () {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter number 1: ");
//        number1 = scanner.nextInt();
//        System.out.println("Enter number 2: ");
//        number2 = scanner.nextInt();
//        System.out.println("Enter number 3: ");
//        number3 = scanner.nextInt();
//
//
//        if (number1 > number2 && number1 > number3 ) {
//            return number1;
//        } else if (number2 > number1 && number2 > number3 ) {
//            return number2;
//        } else  {
//            return number3;
//        }
//
//    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println("Highest number is: " + task2.findLargest(task2.number1, task2.number2, task2.number3));

       // System.out.println("Highest number is: " + task2.findLargest());
    }
}
