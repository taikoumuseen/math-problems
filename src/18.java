import java.util.Scanner;

public class MathProblemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter the operation (addition, subtraction, multiplication, division): ");
        String operation = scanner.next();
        
        if ("addition".equals(operation)) {
            double result = num1 + num2;
        } else if ("subtraction".equals(operation)) {
            double result = num1 - num2;
        } else if ("multiplication".equals(operation)) {
            double result = num1 * num2;
        } else if ("division".equals(operation)) {
            double result = num1 / num2;
        } else {
            System.out.println("Invalid operation!");
        }
        
        System.out.println("The result is: " + result);
    }
}
