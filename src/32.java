public class MathProblems {
    public static void main(String[] args) {
        // Example 1: Simple addition problem
        int result = add(5, 3);
        System.out.println("The sum of 5 and 3 is " + result);

        // Example 2: Addition with subtraction (negative numbers)
        int result = add(-4, -7);
        System.out.println("The sum of (-4) and (-7) is " + result);

        // Example 3: Division problem
        int result = divide(10, 5);
        System.out.println("The quotient of 10 divided by 5 is " + result);

        // Example 4: Simple multiplication
        int result = multiply(6, 4);
        System.out.println("The product of 6 and 4 is " + result);

        // Example 5: Sum of squares problem
        int result = sumOfSquares(3, 2);
        System.out.println("The sum of the squares of 3 and 2 is " + result);

        // Example 6: Finding square root using Math.sqrt()
        double result = sqrt(16);
        System.out.println("The square root of 16 is " + result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int sumOfSquares(int x, int y) {
        return x + y;
    }

    private static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root for negative numbers.");
        }
        return Math.sqrt(number);
    }
}
