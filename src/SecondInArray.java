import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SecondInArray {
    private static int[] input() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many random numbers shall we sort?");

        int num = 0;
        try {
            num = input.nextInt();
        } catch (InputMismatchException e) {
            input();
        }

        System.out.print("The numbers to sort are: ");

        int[] toSort = new int[num];
        for (int i = 0; i < toSort.length; i++) {
            toSort[i] = random.nextInt(100);
            System.out.print(toSort[i] + " ");
        }
        System.out.println();
        return toSort;
    }

    private static void findSecond(int[] toSort) {
        Arrays.sort(toSort);
        int i = toSort.length - 2;

        System.out.print("The second highest value is: ");
        System.out.print(toSort[i] + "\n");
    }
    public static void main(String[] args) {
        boolean isOn = true;
        while (isOn) {
            findSecond(input());
        }
    }
}
