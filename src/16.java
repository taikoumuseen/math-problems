public class MathSolver {
    public static int solveEquation(String equation) {
        // Assuming the equation contains only basic arithmetic operations: +, -, *, / (division)
        String[] parts = equation.split(" ");
        int x = 1;
        
        for (String part : parts) {
            if (!part.isEmpty() && !part.equals("+") && !part.equals("-")) {
                throw new IllegalArgumentException("Invalid part of the equation.");
            }
            if (!part.isEmpty() && part.equals("=")) {
                return x;
            }
            try {
                int num = Integer.parseInt(part);
                x += (num == 0 ? 1 : -x) / num;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid part of the equation.");
            }
        }
        
        throw new IllegalArgumentException("Unable to solve the equation.");
    }

    public static void main(String[] args) {
        try {
            int result = solveEquation("2 + 3 - 5 * 2 / 2");
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
