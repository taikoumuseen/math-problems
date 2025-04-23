public class MathSolver {
    public double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                }
                throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + MathSolver.calculate(10, 5, '+')); // 15
        System.out.println("Result: " + MathSolver.calculate(2.5, 3, '*')); // 7.5
        try {
            System.out.println("Result: " + MathSolver.calculate(4, 0, '/')); // 0, division by zero is not allowed.
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
