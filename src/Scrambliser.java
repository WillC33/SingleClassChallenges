import java.util.Scanner;

public class Scrambliser {

    private static String[] input() {

        boolean oneCharReplacee = false;
        boolean oneCharReplacement = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String baseWord = input.nextLine();

        System.out.println("Which character do you want to replace?");
        String replacee = input.nextLine();
        while (!oneCharReplacee) {
            if (replacee.length() == 1) {
                oneCharReplacee = true;
            } else {
                System.out.println("Please choose a single character");
                replacee = input.nextLine();
            }
        }

        System.out.println("With what?");
        String replacement = input.nextLine();
        while (!oneCharReplacement) {
            if (replacement.length() == 1) {
                oneCharReplacement = true;
            } else {
                System.out.println("Please choose a single character");
                replacement = input.nextLine();
            }
        }

        String[] dataToPass = {baseWord, replacee, replacement};
        return dataToPass;
    }

    private static void replace(String[] dataToPass) {
       char[] baseWord = dataToPass[0].toCharArray();
       char[] replacee = dataToPass[1].toCharArray();
       char[] replacement = dataToPass[2].toCharArray();

       System.out.println("The edited word is: ");
       for(int i = 0; i < baseWord.length; i++) {
           if (baseWord[i] == replacee[0]) {
               baseWord[i] = replacement[0];
           } System.out.print(baseWord[i]);
       }
    }


    public static void main(String[] args) {
        replace(input());
    }
}
