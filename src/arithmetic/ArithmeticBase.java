package arithmetic;

import java.util.Scanner;

public class ArithmeticBase 
{
    public double x, y;

    // Enum for arithmetic operations
    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    double calculate(double x, double y, Operation operation) 
    {
        switch (operation) 
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y != 0) {
                    return x / y;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new AssertionError("Unknown operation: " + operation);
        }
    }

    public static void main(String[] args) 
    {
        ArithmeticBase arithmeticBase = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        
        // Taking user inputs for the two numbers
        System.out.print("Enter the first number: ");
        double x = in.nextDouble();
        System.out.print("Enter the second number: ");
        double y = in.nextDouble();
        
        // Taking input for operation
        System.out.println("Enter the arithmetic operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationInput = in.next().toUpperCase();
        
        // Convert string input to enum
        Operation operation = Operation.valueOf(operationInput);
        
        // Perform the calculation and display the result
        double result = arithmeticBase.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}
