import java.util.Random;

public class MathProblem {
    public static int solve(int num1, int num2) {
        Random random = new Random();
        int operation = random.nextInt(3);
        switch (operation) {
            case 0:
                return num1 + num2;
            case 1:
                return num1 - num2;
            case 2:
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
