import java.util.Scanner;

public class MaxHandshakes{
	// Method to calculate maximum handshakes
    	public static int calculateHandshakes(int n) {
        	if (n < 2) {
            		return 0; // No handshakes possible with fewer than 2 students
        	}
        	return (n * (n - 1)) / 2; // Combination formula for handshakes
    	}   
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input for number of students
        	System.out.print("Enter the number of students: ");
        	int n = sc.nextInt();

        	// Calculate the maximum number of handshakes
        	int handshakes = calculateHandshakes(n);

        	// Display the result
        	System.out.println("The maximum number of handshakes is: " + handshakes);
    }

}
