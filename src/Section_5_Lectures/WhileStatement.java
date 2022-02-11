package Section_5_Lectures;

public class WhileStatement {
    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("********************************");
//
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
//
////        System.out.println("Final count value " + count);
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//
//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int countEvenNumbers = 0;
        int sumEvenNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            countEvenNumbers++;
            sumEvenNumbers += number;
            System.out.println("Even number " + number);
            if (countEvenNumbers == 5) {
                System.out.println("The sum of " + countEvenNumbers + " even numbers is " + sumEvenNumbers);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0) ? true : false;
    }

}
