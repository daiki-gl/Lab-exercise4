import java.util.Scanner;

public class Calc extends Operators {
    protected String keep;

    public void calc() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type the first number");
        inputNum1 = scan.nextInt();

        System.out.println(
                "Choose an operation: \n > Type + for addtion \n > Type - for subtraction \n > Type * for multiplication \n > Type / for division");
        operator = scan.next();

        if (!operator.matches("^[+-/*]")) {
            System.out.println("Wrong operator. Cannot calculate");
        } else {
            System.out.println("Please type the second number");
            inputNum2 = scan.nextInt();

            if (operator.equals("+")) {
                addtion(inputNum1, inputNum2);
            } else if (operator.equals("-")) {
                subtraction(inputNum1, inputNum2);
            } else if (operator.equals("*")) {
                multiplication(inputNum1, inputNum2);
            } else if (operator.equals("/") && inputNum2 == 0) {
                System.out.println("cannot divide by 0");
            } else {
                divide(inputNum1, inputNum2);
            }
        }

        System.out.println("Do you want to continue or quit?");
        keep = scan.next().toLowerCase();
        if (keep != "continue" || keep != "quit") {
            System.out.println("Try again from first");
        }
    }
}
