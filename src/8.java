 public static void main(String[] args) {

    // Generate a random number between 1 and 10
    int num = (int)(Math.random() * 10 + 1);

    // Prompt the user to guess the number
    System.out.print("Guess the number: ");

    // Read the input from the user
    Scanner scanner = new Scanner(System.in);
    int guess = scanner.nextInt();

    // Check if the guess is correct
    if (guess == num) {
        System.out.println("Correct!");
    } else {
        System.out.println("Incorrect, try again");
    }
}
