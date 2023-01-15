import java.util.InputMismatchException;
import java.util.Scanner;
public class SquaresAndCircles {

    private static char shape() {
        Scanner input = new Scanner(System.in);
        
        char shape = 0;
        System.out.println("Is the shape a circle (enter c) or square? (enter s) ");
        if (input.hasNext("c")) {
            shape = 'c';
            return shape;
        } else if (input.hasNext("s")){
            shape = 's';
            return shape;
        } else {
            shape();
        }
        return shape;
    }

    private static double input(char shape) {
        Scanner input = new Scanner(System.in);

        double toArea = 0;
        if (shape == 'c') {
            System.out.println("Enter the radius: ");
            toArea = 0;
            try {
                toArea = input.nextDouble();
            } catch (InputMismatchException e) {
                input('c');
            }

        } else {
            input();
        }
        return toArea;
    }
    private static double[] input() {
        Scanner input = new Scanner(System.in);

        double[] toArea = new double[2];
            System.out.println("Enter the width: ");
            try {
                toArea[0] = input.nextDouble();
            } catch (InputMismatchException e) {
                input();
            }
        System.out.println("Enter the height: ");
        try {
            toArea[1] = input.nextDouble();
        } catch (InputMismatchException e) {
            input();
        }
        return toArea;
    }

//area methods
    private static void area(double toArea) {
        double area = Math.PI * (2 * toArea);
        System.out.println(area);
    }
    private static void area(double[] sides) {
        double area = sides[0] * sides[1];
        System.out.println(area);
    }
    public static void main(String[] args) {
        char shape = shape();
        if (shape == 'c') {
            area(input('c'));
        } else {
            area(input());
        }
    }
}
