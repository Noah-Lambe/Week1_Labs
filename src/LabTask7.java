import java.util.Scanner;

public class LabTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Convert Decimal to Binary");
            System.out.println("2. Convert Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Decimal to Binary
                    System.out.print("Enter a decimal number: ");
                    int decimal = sc.nextInt();
                    String binary = Integer.toBinaryString(decimal);
                    System.out.println("Binary representation: " + binary);
                    break;

                case 2: // Binary to Decimal
                    System.out.print("Enter a binary number: ");
                    String binaryInput = sc.next();
                    try {
                        int decimalOutput = Integer.parseInt(binaryInput, 2);
                        System.out.println("Decimal representation: " + decimalOutput);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number. Please try again.");
                    }
                    break;

                case 3: // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println();
        } while (choice != 3);

        sc.close();


    }
}
