import java.util.Scanner;

public class PositiveNegative {
	
	// Method to check if a number is positive, negative, or zero
	public static int checkNumber(int n) {
        	if (n > 0) {
			return 1; // Positive number
        	} 
        	else if (n < 0) {
            		return -1; // Negative number
        	} 
        	else {
        		return 0; // Zero
        	}
	}

  
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter a number: ");
        	int n = sc.nextInt();

        	// Check whether the number is positive, negative, or zero
        	int result = checkNumber(n);

        	// Display the result based on the returned value
        	System.out.println(result);
	}

} 
