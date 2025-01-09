import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LabTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numberlist = new ArrayList<>();

        System.out.println("Enter a number (-999 to stop): ");
        while (true) {
            int number = sc.nextInt();
            if (number == -999) {
                break;
            }
            numberlist.add(number);
        }

        System.out.println(numberlist);
        double sum = 0;

        for (int number : numberlist) {
            sum += number;
        }

        double average = sum / numberlist.size();
        System.out.printf("Average: %.2f\n", average);

        sc.close();
    }
}
