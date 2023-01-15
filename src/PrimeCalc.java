import java.util.InputMismatchException;
import java.util.Scanner;
public class PrimeCalc {

    private static long input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number to check");
        long toCheck = 0;
        try {
            toCheck = input.nextLong();
        } catch (InputMismatchException e) {
            input();
        }
        return toCheck;
    }

    private static boolean primeCheck(long toCheck) {
        boolean isPrime = false;

        if (toCheck == 1 || toCheck == 2 ||toCheck == 3 ||toCheck == 5 ||toCheck == 7) {
            isPrime = true;
            return isPrime;
        }

        for (int i = 2; i <= 9; i++) {
            long remainder = toCheck % i;
            if (remainder == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        } return isPrime;
    }

        private static void print(boolean isPrime) {
            if (isPrime) {
                System.out.println(" This is a prime number");
            } else {
                System.out.println("This is not a prime number");
            }
        }

        public static void main (String[]args){
        boolean isOn = true;

            while (isOn){
                print(primeCheck(input()));
            }

        }

}

