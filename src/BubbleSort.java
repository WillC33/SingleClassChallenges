import java.util.Random;
public class BubbleSort {

    public static int[] toSort() {
        int[] toSort = new int[5];
        System.out.print("The array elements to sort are: ");

        for (int i = 0; i < toSort.length; i++) {
            Random randNum = new Random();
            toSort[i] = randNum.nextInt(100);
            System.out.print(toSort[i] + " ");

        }
        System.out.println();
        return toSort;
    }

    public static void sort(int[] toSort) {
        int placeholder;
        //for (//each element on the pass)
        for (int i = 0; i < toSort.length-1; i++) {
            for (int j = 0; j < toSort.length - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    placeholder = toSort[j + 1];
                    toSort[j + 1] = toSort[j];
                    toSort[j] = placeholder;
                }
            }
        } printArray(toSort);
    }

    public static void printArray(int[] toSort) {
        System.out.print("The sorted array elements are: ");
        for (int j : toSort) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
       int[] toSort = toSort();
       sort(toSort);
    }
}
