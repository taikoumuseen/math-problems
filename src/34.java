public class MathProblems {
    public static void main(String[] args) {
        // Example math problems and solution using Java
        System.out.println("Example 1: Find the square root of a number.");
        double num = 25;
        double sqrtNum = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + sqrtNum);

        System.out.println("\nExample 2: Calculate the area of a rectangle.");
        double length = 10;
        double width = 5;
        double area = length * width;
        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is " + area);

        System.out.println("\nExample 3: Find the circumference of a circle.");
        double radius = 4;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle with radius " + radius + " is " + circumference);
    }
}
