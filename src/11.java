import java.util.*;
public class MathProblems {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        String operation = "+-*/";
        int index = (int)(Math.random() * operation.length());
        char op = operation.charAt(index);
        System.out.println(num1 + " " + op + " " + num2 + " = ");
    }
}
