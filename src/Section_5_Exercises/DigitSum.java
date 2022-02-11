package Section_5_Exercises;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(15));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
        System.out.println(sumDigits(-225));
        System.out.println("************************");
        System.out.println("integer " + 2 / 10);
        System.out.println("double " + 9d / 10d);
        System.out.println("float " + 2f / 10f);
        System.out.println("long " + 2l / 10l);
        System.out.println("double " + 2.00 / 10.00);
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
