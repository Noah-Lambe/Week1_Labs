public class LabTask3 {
    public static void main(String[] args) {
        int deposit = 1000;
        double profitRate = 0.05;
        int years = 10;

        for (int i = 1; i <= years; i++) {
            double calculateProfit = deposit + (profitRate * deposit);
            deposit = (int) calculateProfit;
            System.out.printf("\nYear: %d %.2f", i, calculateProfit);
        }
    }
}
