public class LabTask3 {
    public static void main(String[] args) {
        int deposit = 1000;
        double profitRate = 0.05;

        double calculateProfit = deposit + (profitRate * deposit);

        System.out.println("Profit after 5% increase: " + calculateProfit);
    }
}
