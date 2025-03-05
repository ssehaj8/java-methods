import java.util.Scanner;

public class Rounds{

	public static int calculateRounds(double side1, double side2, double side3) {
        	// Calculate the perimeter of the triangular park
        	double perimeter = side1 + side2 + side3;

        	// Total distance to run (5 km converted to meters)
        	double totalDistance = 5000;

        	// Calculate the number of rounds needed
        	return (int) Math.ceil(totalDistance / perimeter);
    	}
	public static void main(String[] args) {
       		Scanner sc = new Scanner(System.in);

        	// Take user input for the three sides of the triangular park
        	System.out.print("Enter the length of side 1 (in meters): ");
        	double s1 = sc.nextDouble();
	
        	System.out.print("Enter the length of side 2 (in meters): ");
        	double s2 = sc.nextDouble();

        	System.out.print("Enter the length of side 3 (in meters): ");
        	double s3 = sc.nextDouble();

        	// Calculate the number of rounds needed for a 5km run
        	int rounds = calculateRounds(s1, s2, s3);

        	// Display the result
        	System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5km run.");
	}
}
