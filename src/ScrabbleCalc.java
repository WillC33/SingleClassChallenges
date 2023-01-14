import java.util.Scanner;

public class ScrabbleCalc {

    public ScrabbleCalc() {
        System.out.println("Enter a word: ");
        System.out.println("(or enter \"-\" to exit)");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toUpperCase();

        while (!word.equals("-")) {
            int score = score(word, 0);
            System.out.println("The word " + word + " is worth " + score + " points" + "\n");
            System.out.println("Enter another word: ");
            System.out.println("(or enter \"-\" to exit)");
            word = input.nextLine().toUpperCase();
        }
    }


    public int score(String word, int wordScore) {
        String[] POINT_LETTERS = {"AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ"};
        int[] POINT_SCORES = {1, 2, 3, 4, 5, 8, 10};
        char[] letters = word.toUpperCase().toCharArray();

        for (char letter : letters) {
            for (int j = 0; j < 7; j++) {
                if (POINT_LETTERS[j].indexOf(letter) != -1) {
                    wordScore += POINT_SCORES[j];
                }
            }
        }
        return wordScore;
    }

    public static void main(String[] args) {
        new ScrabbleCalc();
    }
}
