import java.util.Scanner;

public class MathProblemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();

        if (operation.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + (double) num1 / num2);
            } else {
                System.out.println("Divison by zero is not allowed!");
            }
        } else {
            System.out.println("Invalid operation!");
        }

        scanner.close();
    }
}
