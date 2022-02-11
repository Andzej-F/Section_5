package Section_5_Lectures;

public class ForStatement {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i += 1) {
            System.out.println("10,000 at " + i + "% interest = "
                    + calculateInterest(10_000.0, i));
        }
        System.out.println();

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = "
                    + calculateInterest(10_000.0, i));
        }

        int primeNumberCount = 0;

        for (int i = 10; i < 45; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number " + i);
                primeNumberCount++;
                if (primeNumberCount == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
