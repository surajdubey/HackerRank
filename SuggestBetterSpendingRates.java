import java.util.*;
class SuggestBetterSpendingRates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double portfolioValue  = scanner.nextDouble();
        double interestRate = scanner.nextDouble() / 100.0;
        int time = scanner.nextInt();
        int thresold = scanner.nextInt();
        int ar[] = new int[time];

        for(int i=0; i<time; i++) {
            ar[i] = scanner.nextInt();
        }
    }
}
