package Section_5_Exercises;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));// 7
        System.out.println(getLargestPrime(45));// 5
        System.out.println(getLargestPrime(16));// 2
        System.out.println(getLargestPrime(21)); //should return 7 s
        System.out.println(getLargestPrime(217));// should return 31
        System.out.println(getLargestPrime(0));// should return -1 s
        System.out.println(getLargestPrime(45));// should return 5 s
        System.out.println(getLargestPrime(-1));// should return -1

//        System.out.printl(isPrime(5));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 2;

        //  2; 2<=45; 2++
        //   ; 3<=45; 3++
        for (int divider = 2; divider <= number; divider++) {

            // 45%2==0 false
            // 45%3==0 true

            //45%5==0 true
            if (number % divider == 0) {
                int count = 0;

                // 1; 1<=3; 1++
                //  ; 2<=3; 2++
                //  ; 3<=3; 3++

                //1; 1<=5; 1++
                //   5<=5; 5++
                for (int i = 1; i <= divider; i++) {

                    // 3%1==0 true
                    // 3%2==0 false
                    // 3%3==0 true

                    //5%1==0 true
                    //5%5==0 true
                    if (divider % i == 0) {

                        //count= 1
                        //count= 2

                        //count=1
                        //count=2
                        count++;
                    }

                    if (count == 2 && number % i == 0) {
                        if (largestPrime < i) {
                            largestPrime = i;
                        }
//                        System.out.println("line 63 largestPrime " + largestPrime);
                    }
                }
            }
        }


        return largestPrime;
    }


}
/*Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should
return -1 to indicate an invalid value.

The method should calculate the largest prime factor of a given number and return it.

EXAMPLE INPUT/OUTPUT:
* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
* getLargestPrime (-1); should return -1 since the parameter is negative

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot
contain prime numbers.

NOTE: The method getLargestPrime should be defined as public static like we have
been doing so far in the course.
NOTE: Do not add a main method to the solution code.*/
