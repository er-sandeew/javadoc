/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public class SimpleCalculator {

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     *
     * @param a the number to be subtracted from
     * @param b the number to subtract
     * @return the result of a minus b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides one number by another.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * Main method to demonstrate the calculator's functionality.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        
        System.out.println("Addition: " + calculator.add(5, 3)); // Output: 8.0
        System.out.println("Subtraction: " + calculator.subtract(5, 3)); // Output: 2.0
        System.out.println("Multiplication: " + calculator.multiply(5, 3)); // Output: 15.0
        System.out.println("Division: " + calculator.divide(5, 3)); // Output: 1.6666666666666667
        
        // Uncomment to test division by zero
        // System.out.println("Division by Zero: " + calculator.divide(5, 0));
    }
}
