import java.util.Scanner;
import java.util.Arrays;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int index = 0;

        while (index < 5) {
            System.out.println("Enter a number: ");
            numbers[index] = sc.nextInt();
            index++;
        }

        Arrays.sort(numbers);
        System.out.println(numbers[4]);
        sc.close();
    }
}
