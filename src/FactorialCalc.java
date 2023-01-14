import java.util.InputMismatchException;
import java.util.Scanner;
public class FactorialCalc {

    public static void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            int number = input.nextInt();
            if (number > 0) {
                factorialIt(number);
            } else {
                input();
            }
        } catch (InputMismatchException e) {
            input();
        }
    }

    //iteration
    public static void factorialIt(int number) {
        int product = 1;

        for (int i = number; i > 0;  i--) {
                product *= i;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
       input();
    }
}
