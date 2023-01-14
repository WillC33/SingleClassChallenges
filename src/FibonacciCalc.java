import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FibonacciCalc {

    public static int input() {
        boolean isValidInt = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int toCount = 0;

        try {
            while (!isValidInt) {
                toCount = input.nextInt();

                if (toCount > 0) {
                    isValidInt = true;
                } else System.out.println("One does not simply Fibonacci that!");
            }
        } catch (InputMismatchException e) {
            System.out.println("One does not simply Fibonacci that!");
            input();
        }  return toCount;
    }

    public static void Fibonacci(int maxNumber) {

       BigInteger previousNumber = BigInteger.valueOf(0);
       BigInteger nextNumber = BigInteger.valueOf(1);

       System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            BigInteger sum = previousNumber.add(nextNumber);
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }

    public static void main(String[] args) {

        int toCount = input();
        Fibonacci(toCount);
    }
}
