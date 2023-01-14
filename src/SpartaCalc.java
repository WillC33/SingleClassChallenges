import java.util.Scanner;
public class SpartaCalc {
    Scanner input = new Scanner(System.in);

    public SpartaCalc() {
        double input1 = numberOne();
        String operator = operation();
        double input2 = numberTwo(operator);
        answer(input1, operator, input2);
    }

    //take input 1
    public double numberOne() {
        System.out.println("Enter a number: ");

        while (!input.hasNextDouble()) {
            System.out.println("Invalid input, please enter a valid number.");
            input.next();

        } return input.nextDouble();
    }


    //take operator
    public String operation() {
        boolean isOperator = false;

        System.out.println("Enter an operation + - / or *: ");

        String operator = null;
        while (!isOperator) {
            operator = input.nextLine();

            if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
                isOperator = true;
            }
        } return operator;
    }

    //take input 2
    public double numberTwo(String operator) {
        System.out.println("Enter another number: ");

        boolean inputIsNot0 = false;
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input, please enter a valid number.");
            input.next();
        }
        double input2 = input.nextDouble();

        while (!inputIsNot0) {
            if (operator.equals("/") && input2 == 0) {
                System.out.println("Can't divide by 0");
                input2 = input.nextDouble();
            } else {
                inputIsNot0 = true;
            }
        }
        return input2;
    }


    //calculation
    public void answer(double input1, String operator, double input2){
        double ans;

        System.out.print(input1 + " " + operator + " " + input2 + " = ");

        ans = switch (operator) {
            case "+" -> input1 + input2;
            case "-" -> input1 - input2;
            case "/" -> input1 / input2;
            default -> input1 * input2;
        };
        System.out.print(ans);
    }

    public static void main(String[] args) {
        new SpartaCalc();
    }
}



