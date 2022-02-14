package Section_5_Exercises;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid Number");
                scanner.next();
            }
            int number = scanner.nextInt();

            sum += number;
            count++;

        }
        System.out.println("The sum of your numbers is " + sum);
        scanner.close();
    }
}

