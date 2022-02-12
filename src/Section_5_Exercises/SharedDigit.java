package Section_5_Exercises;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int param1, int param2) {
        if ((param1 < 10 || param1 > 99) || (param2 < 10 || param2 > 99)) {
            return false;
        }

        int firstParam1 = param1 / 10;
        int lastParam1 = param1 % 10;
        int firstParam2 = param2 / 10;
        int lastParam2 = param2 % 10;

        if (firstParam1 == firstParam2 ||
                firstParam1 == lastParam1 ||
                lastParam1 == firstParam2 ||
                lastParam1 == lastParam2
        ) {
            return true;
        }

        return false;
    }
}
/*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers
is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12
and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.*/