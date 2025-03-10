import java.util.Random;
class MathProblem {
    public int solve(int n) {
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(10);
        return a + b;
    }
}