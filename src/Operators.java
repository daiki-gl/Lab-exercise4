public class Operators {
    protected int inputNum1;
    protected int inputNum2;
    protected String operator;
    protected double sum;

    public void addtion(int inputNum1, int inputNum2) {
        sum = inputNum1 + inputNum2;
        System.out.println(inputNum1 + " + " + inputNum2 + " = " + sum);
    }

    public void subtraction(int inputNum1, int inputNum2) {
        sum = inputNum1 - inputNum2;
        System.out.println(inputNum1 + " - " + inputNum2 + " = " + sum);
    }

    public void multiplication(int inputNum1, int inputNum2) {
        sum = inputNum1 * inputNum2;
        System.out.println(inputNum1 + " * " + inputNum2 + " = " + sum);
    }

    public void divide(int inputNum1, int inputNum2) {
        sum = (double) inputNum1 / inputNum2;
        // sum = (int) (sum * 1000);
        // sum = sum / 1000;
        System.out.println(inputNum1 + " / " + inputNum2 + " = " + sum);
    }
}
