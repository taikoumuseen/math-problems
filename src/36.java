public class MathProblems {
    public static void main(String[] args) {
        // Example code to solve math problem 1
        double result = calculate(2.0, 3.0);
        System.out.println("The result of 2 + 3 is: " + result);

        // Example code to solve math problem 2
        int age = 25;
        if (age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("Sorry, you're not old enough to vote.");
        }
    }

    // Helper method to calculate the sum of two numbers
    private static double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
