import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter an operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    System.out.printf("%d / %d = %.2f\n", num1, num2, (double) num1 / num2);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }



    }
}
