import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;

public class LabTask6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];

        // Fill the array with random integers between 0 and 100
        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10);
        }

        // Sort the array
        Arrays.sort(numbers);

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            // Update the count for each number
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each number
        System.out.println("Number Frequencies:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " appears " + frequencyMap.get(key) + " times.");
        }
    }
}
