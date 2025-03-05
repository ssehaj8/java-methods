import java.util.Scanner;

public class TrigFunctionCalculator {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Store results in an array
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Get trigonometric function results
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        System.out.printf("Tangent: %.4f%n", results[2]);
    }
}
