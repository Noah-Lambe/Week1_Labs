import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (0-9): ");
        int num1 = sc.nextInt();

        if (num1 > 9) {
            System.out.println("Invalid input. Please enter a number between 0 and 9.");
        } else if (num1 == 0) {
            System.out.println("Zero.");
        } else if (num1 == 1) {
            System.out.println("One.");
        } else if (num1 == 2) {
            System.out.println("Two.");
        } else if (num1 == 3) {
            System.out.println("Three.");
        } else if (num1 == 4) {
            System.out.println("Four.");
        } else if (num1 == 5) {
            System.out.println("Five.");
        } else if (num1 == 6) {
            System.out.println("Six.");
        } else if (num1 == 7) {
            System.out.println("Seven.");
        } else if (num1 == 8) {
            System.out.println("Eight.");
        } else if (num1 == 9) {
            System.out.println("Nine.");
        }

        sc.close();
    }
}
