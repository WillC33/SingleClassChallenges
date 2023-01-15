import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MissingNumberGame {

    private static void input() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int length = 0;
        boolean validInput = false;

        System.out.println("How many numbers shall we play with? Higher is more difficult!");
         while (!validInput) {
            try {
                length = input.nextInt();
                if (length == 1) {
                    System.out.println("We can't play with one number!");
                } else if (length <= 0) {
                    System.out.println("Please enter a valid number!");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                input.next();
            }
        }
        int[] consecutives = new int[length];
        consecutives[0] = random.nextInt(100);

        System.out.println("The numbers in the set are: ");
        System.out.print(consecutives[0]  + " ");
        for (int i = 1; i < length; i++) {
            consecutives[i] = consecutives[i - 1] + 1;
            System.out.print(consecutives[i] + " ");
        }
        System.out.println("\nNow we will remove a random number\nGuess which one!");
        removeInt(consecutives);
    }

    private static void removeInt(int[] consecutives) {
        Random random = new Random();
        int [] consecutivesRemoval = new int[consecutives.length];
        System.arraycopy(consecutives, 0, consecutivesRemoval, 0, consecutives.length);

        int indexToRemove = random.nextInt(consecutivesRemoval.length);
        consecutivesRemoval[indexToRemove] = 0;
        findMissing(consecutives, consecutivesRemoval);

    }
    private static void findMissing(int[] consecutives, int[] consecutivesRemoval) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < consecutives.length; i++) {
            sum1 = sum1 + consecutives[i];
        }

        for (int i = 0; i < consecutives.length; i++) {
            sum2 = sum2 + consecutivesRemoval[i];
        }
        int missingNum = sum1 - sum2;
        gameLogic(missingNum);
    }

    private static void gameLogic(int missingNum) {

        Scanner input = new Scanner(System.in);
        System.out.println("What number is missing?");
        int guess = 0;
        try {
            guess = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number...");
            gameLogic(missingNum);
        }
        if (missingNum == guess) {
            System.out.println("You win! (y to play again, n to quit)");
            continuePrompt();
        } else {
            System.out.println("Sorry, the missing number was " + missingNum + "\nLet's play again? (y to play again, n to quit)");
            continuePrompt();
        }
    }

    private static void continuePrompt() {
        boolean continueGame = true;
        Scanner input = new Scanner(System.in);
        while (continueGame) {
            String cont = input.nextLine();
            if (cont.equals("y")) {
                input();
            } else if (cont.equals("n")) {
                continueGame = false;
            } else {
                System.out.println("Sorry I didn't understand. y to play again or n to quit");
            }
        }
    }
    public static void main(String[] args) {
        input();
    }
}
