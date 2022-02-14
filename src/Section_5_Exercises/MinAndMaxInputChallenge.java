package Section_5_Exercises;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int minNumber = Integer.MAX_VALUE;
//        int maxNumber = Integer.MIN_VALUE;
        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();

                if (first) {
                    first = false;
                    minNumber = userNumber;
                    maxNumber = userNumber;
                }

                if (userNumber >= maxNumber) {
                    maxNumber = userNumber;
                } else if (userNumber < minNumber) {
                    minNumber = userNumber;
                }
                System.out.println("The maximum nuber was: " + maxNumber);
                System.out.println("The minimum nuber was: " + minNumber);
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The maximum nuber was: " + maxNumber);
        System.out.println("The minimum nuber was: " + minNumber);
    }
}
