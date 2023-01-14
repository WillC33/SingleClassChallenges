import java.util.Arrays;
import java.util.Scanner;
public class Palindrominator {

        //take input
    public static void input() {
        Scanner reader = new Scanner(System.in);
        System.out.print("What do you want to check? ");
        String string = reader.nextLine();

        char[] word = string.toCharArray();
        string = Arrays.toString(word); //this puts the string into the same format as its reverse later.

        reverse(string, word, word.length);
    }

        //string reverse method
        static void reverse(String string, char[] a, int n) {

            char[] b = new char[n];
            int j = n;
            for (int i = 0; i < n; i++) {
                b[j - 1] = a[i];
                j = j - 1;
            }
            // printing the reversed array
            System.out.print("That backward is: ");
            for (int k = 0; k < n; k++) {
                System.out.print(b[k]);
            }
            System.out.println();
            String reversedString = Arrays.toString(b);

            verify(string, reversedString);
        }

        //verify status
    public static void verify(String string, String reversedString) {
        if (string.equals(reversedString)) {
            System.out.println("It's a palindrome");
        } else System.out.println("It's not a palindrome");
    }

        public static void main(String[] args){
            input();
        }
    }
