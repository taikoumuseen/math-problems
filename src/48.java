import org.apache.commons.math3.distribution.BinomialDistribution;

public class MathProblems {
    public static void main(String[] args) {
        // Generate sample data
        double p = 0.5; // Probability of success
        int n = 100; // Sample size

        // Calculate binomial distribution
        BinomialDistribution binomialDist = new BinomialDistribution(p, n);
        System.out.println("Binomial Distribution: " + binomialDist);

        // Generate a random number using the binomial distribution
        double randomNumber = binomialDist.nextDouble();
        System.out.println("Random number generated: " + randomNumber);
    }
}
