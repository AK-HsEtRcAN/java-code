import java.util.Scanner;
public class ModulusCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ModulusCalculator operand1 operand2");
            return;
        }

        try {
            double operand1 = Double.parseDouble(args[0]);
            double operand2 = Double.parseDouble(args[1]);

            if (Double.isNaN(operand1) || Double.isNaN(operand2)) {
                throw new NumberFormatException("One or both operands are not valid numbers.");
            }

            if (operand2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double result = operand1 % operand2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error");
        }
    }
}